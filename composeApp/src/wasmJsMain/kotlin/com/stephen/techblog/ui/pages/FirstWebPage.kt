package com.stephen.techblog.ui.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.stephen.techblog.data.ThemeState
import com.stephen.techblog.ui.component.CenterText
import com.stephen.techblog.ui.component.LinkText
import com.stephen.techblog.ui.component.SimpleDivider
import com.stephen.techblog.ui.component.rememberToastState
import com.stephen.techblog.ui.theme.csdnColorFilter
import com.stephen.techblog.ui.theme.juejinColorFilter
import com.stephen.techblog.ui.theme.webTitleText
import org.jetbrains.compose.resources.painterResource
import techblog.composeapp.generated.resources.*

@Composable
fun FirstWebPage(currentTheme: ThemeState, onThemeWitch: (ThemeState) -> Unit) {

    val toastState = rememberToastState()

    Box(
        modifier = Modifier.fillMaxSize(1f),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(Res.drawable.logo),
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.padding(bottom = 20.dp).size(100.dp).clip(RoundedCornerShape(50)),
                contentDescription = "avatar"
            )

            CenterText(text = "Stephen's Blogs", fontFamily = FontFamily.Monospace, style = webTitleText, modifier = Modifier.padding(bottom = 20.dp))

            SimpleDivider(modifier = Modifier.padding(bottom = 20.dp).height(2.dp).width(120.dp))

            CenterText(text = "在知中行，在行中知", modifier = Modifier.padding(bottom = 20.dp))

            LinkText(text = "博客目录", modifier = Modifier.padding(bottom = 20.dp)) {
                toastState.show("博客目录")
            }

            LinkText(text = "关于", modifier = Modifier.padding(bottom = 20.dp)) {
                toastState.show("关于")
            }
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 20.dp).align(Alignment.BottomCenter)
        ) {
            Image(
                painter = painterResource(Res.drawable.ic_juejin),
                contentDescription = "xitujuejin",
                colorFilter = juejinColorFilter,
                modifier = Modifier.padding(end = 20.dp).size(36.dp).clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                ) {
                    toastState.show("juejin")
                }
            )
            Image(
                painter = painterResource(Res.drawable.ic_csdn),
                contentDescription = "csdn",
                colorFilter = csdnColorFilter,
                modifier = Modifier.padding(end = 20.dp).size(36.dp).clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                ) {
                    toastState.show("csdn")
                }
            )
            Image(
                painter = painterResource(Res.drawable.ic_github),
                contentDescription = "github",
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onPrimary),
                modifier = Modifier.size(36.dp).clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                ) {
                    toastState.show("github")
                }
            )
        }

        // 主题切换
        Image(
            painter = painterResource(Res.drawable.ic_theme),
            contentDescription = "theme_switch",
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onPrimary),
            modifier = Modifier.padding(20.dp).size(28.dp).align(Alignment.TopEnd).clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
            ) {
                if (currentTheme == ThemeState.LIGHT) {
                    onThemeWitch(ThemeState.DARK)
                } else {
                    onThemeWitch(ThemeState.LIGHT)
                }
            }
        )
    }
}