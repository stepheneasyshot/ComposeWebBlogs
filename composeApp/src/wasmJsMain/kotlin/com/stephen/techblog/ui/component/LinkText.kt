package com.stephen.techblog.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.stephen.techblog.ui.theme.defaultText
import com.stephen.techblog.ui.theme.networkTextColor

@Composable
fun LinkText(
    text: String,
    style: TextStyle = defaultText,
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.onPrimary,
    onClick: () -> Unit = {}
) {
    Column(
        modifier = modifier.width(IntrinsicSize.Max).clickable(
            interactionSource = remember { MutableInteractionSource() },
            indication = null,
        ) {
            onClick()
        }) {
        CenterText(
            text = text,
            style = style,
            color = color,
            modifier = Modifier.fillMaxWidth(1f)
        )
        Spacer(Modifier.padding(top = 5.dp).height(1.dp).fillMaxWidth(1f).background(networkTextColor))
    }
}