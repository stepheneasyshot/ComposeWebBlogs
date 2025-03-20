package com.stephen.techblog.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.stephen.techblog.ui.component.BasePage
import com.stephen.techblog.ui.component.CenterText
import com.stephen.techblog.ui.component.SimpleDivider


@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FirstDemoPage() {
    BasePage("FirstDemoPage") {
        Row {
            LazyColumn(modifier = Modifier.weight(0.2f)) {
                items(20) {
                    CenterText(
                        "Item $it",
                        modifier = Modifier.fillParentMaxWidth(1f).padding(10.dp).padding(vertical = 10.dp).clip(
                            RoundedCornerShape(10.dp)
                        ).background(MaterialTheme.colorScheme.surface)
                    )
                }
            }

            SimpleDivider(Modifier.width(2.dp).fillMaxHeight(1f))
            Column(modifier = Modifier.weight(0.8f)) {
                FlowRow(modifier = Modifier.fillMaxSize(1f)) {
                    repeat(100) { CenterText("Item $it") }
                }
            }
        }
    }
}