package com.kyliancc.beginia_android.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BottomBar() {
    NavigationBar {
        NavigationBarItem(
            modifier = Modifier,
            selected = true,
            onClick = {},
            icon = { Icon(Icons.Outlined.CheckCircle, "Todos") },
            label = { Text("Todos") }
        )
        NavigationBarItem(
            modifier = Modifier,
            selected = true,
            onClick = {},
            icon = { Icon(Icons.Outlined.CheckCircle, "Todos") },
            label = { Text("Todos") }
        )
        NavigationBarItem(
            modifier = Modifier,
            selected = true,
            onClick = {},
            icon = { Icon(Icons.Outlined.CheckCircle, "Todos") },
            label = { Text("Todos") }
        )
        NavigationBarItem(
            modifier = Modifier,
            selected = true,
            onClick = {},
            icon = { Icon(Icons.Outlined.CheckCircle, "Todos") },
            label = { Text("Todos") }
        )
    }
}

@Composable
fun NavigationItem() {

}

@Preview(showBackground = true)
@Composable
fun BottomBarPreview() {
    BottomBar()
}