package com.stephen.techblog.ui

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import com.stephen.techblog.data.CatalogItem
import com.stephen.techblog.data.ExpandState
import com.stephen.techblog.data.ThemeState
import com.stephen.techblog.ui.component.SimpleDivider
import com.stephen.techblog.ui.pages.BlogContentPage
import com.stephen.techblog.ui.pages.FirstWebPage
import com.stephen.techblog.ui.theme.DarkColorScheme
import com.stephen.techblog.ui.theme.LightColorScheme

@Composable
fun App() {

    var themeState by remember { mutableStateOf(ThemeState.DARK) }

    var expandState by remember { mutableStateOf(ExpandState.EXPAND) }

    var contentViewCataLog by remember { mutableStateOf(CatalogItem.CATEGORIES) }

    val sideBarWeightAnim = animateFloatAsState(
        targetValue = if (expandState == ExpandState.COLLAPSE) 0.2f else 1f,
        animationSpec = tween(600)
    )

    MaterialTheme(colorScheme = if (themeState == ThemeState.DARK) DarkColorScheme else LightColorScheme) {
        Surface(modifier = Modifier.fillMaxSize(1f).background(MaterialTheme.colorScheme.background)) {
            Row(modifier = Modifier.fillMaxSize(1f)) {
                FirstWebPage(
                    modifier = Modifier.animateContentSize()
                        .fillMaxHeight(1f)
                        .weight(sideBarWeightAnim.value)
                        .pointerInput(Unit) {
                            detectHorizontalDragGestures { _, dragAmount ->
                                if (dragAmount < 0) {
                                    // 左滑逻辑
                                    expandState = ExpandState.COLLAPSE
                                }
                            }
                        },
                    themeState,
                    onThemeWitch = { themeState = it },
                ) {
                    // 折叠侧栏
                    expandState = ExpandState.COLLAPSE
                    contentViewCataLog = it
                }
                if (expandState == ExpandState.COLLAPSE) {
                    SimpleDivider(modifier = Modifier.fillMaxHeight(1f).width(1.dp))
                    BlogContentPage(
                        contentViewCataLog,
                        themeState,
                        modifier = Modifier.fillMaxHeight(1f).weight(0.8f).padding(10.dp)
                            .background(MaterialTheme.colorScheme.surface)
                    )
                }
            }
        }
    }
}