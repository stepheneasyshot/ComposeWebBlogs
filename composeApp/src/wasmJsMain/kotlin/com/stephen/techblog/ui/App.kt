package com.stephen.techblog.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.stephen.techblog.ui.pages.FirstDemoPage

@Composable
fun App() {
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize(1f).background(MaterialTheme.colorScheme.background)) {
            FirstDemoPage()
        }
    }
}