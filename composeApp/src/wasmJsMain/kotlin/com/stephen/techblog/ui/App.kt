package com.stephen.techblog.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.stephen.techblog.data.ThemeState
import com.stephen.techblog.ui.pages.FirstWebPage
import com.stephen.techblog.ui.theme.DarkColorScheme
import com.stephen.techblog.ui.theme.LightColorScheme

@Composable
fun App() {

    var themeState by remember { mutableStateOf(ThemeState.DARK) }

    MaterialTheme(colorScheme = if (themeState == ThemeState.DARK) DarkColorScheme else LightColorScheme) {
        Surface(modifier = Modifier.fillMaxSize(1f).background(MaterialTheme.colorScheme.background)) {
            FirstWebPage(themeState) {
                themeState = it
            }
        }
    }
}