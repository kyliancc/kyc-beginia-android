package com.kyliancc.beginia_android.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kyliancc.beginia_android.ui.theme.BeginiaTheme
import com.kyliancc.beginia_android.ui.docs.DocsView

@Composable
fun BeginiaView() {
    BeginiaTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = { TopBar() },
            bottomBar = { BottomBar() }
        ) {
            innerPadding -> Content(innerPadding)
        }
    }
}

@Composable
fun Content(innerPadding: PaddingValues) {
    DocsView(innerPadding)
}

@Preview(showBackground = true)
@Composable
fun BeginiaPreview() {
    BeginiaView()
}