package com.stephen.techblog.ui.pages

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mikepenz.markdown.compose.Markdown
import com.stephen.techblog.data.CatalogItem
import com.stephen.techblog.data.ThemeState
import com.stephen.techblog.data.longMarkDown
import com.stephen.techblog.ui.component.CenterText
import com.stephen.techblog.ui.theme.markDownDark
import com.stephen.techblog.ui.theme.markDownLight
import com.stephen.techblog.ui.theme.markdownTypography
import com.stephen.techblog.ui.theme.webTitleText

@Composable
fun BlogContentPage(
    catalog: CatalogItem,
    themeState: ThemeState,
    modifier: Modifier
) {
    val markDownColors = when (themeState) {
        ThemeState.DARK -> markDownDark
        ThemeState.LIGHT -> markDownLight
    }

    Row(
        modifier = modifier,
    ) {
        when (catalog) {
            CatalogItem.CATEGORIES -> {
                LazyColumn {
                    item {
                        Markdown(longMarkDown, markDownColors, markdownTypography)
                    }
                }
            }

            CatalogItem.ABOUT_ME -> {
                CenterText(text = "About Me", style = webTitleText)
            }
        }
    }
}