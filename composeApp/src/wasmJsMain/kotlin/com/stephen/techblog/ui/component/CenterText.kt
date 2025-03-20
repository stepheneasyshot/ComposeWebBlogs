package com.stephen.techblog.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import com.stephen.techblog.ui.theme.defaultText
import com.stephen.techblog.ui.theme.getChineseFont

@Composable
fun CenterText(
    text: String,
    style: TextStyle = defaultText,
    modifier: Modifier = Modifier,
    fontFamily: FontFamily = getChineseFont(),
    color: Color = MaterialTheme.colorScheme.onPrimary,
    alignment: Alignment = Alignment.Center
) {
    Box(
        contentAlignment = alignment,
        modifier = modifier
    ) {
        Text(
            text = text,
            style = style,
            color = color,
            fontFamily = fontFamily
        )
    }
}