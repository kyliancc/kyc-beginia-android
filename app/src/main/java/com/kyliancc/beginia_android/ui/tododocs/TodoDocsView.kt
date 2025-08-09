package com.kyliancc.beginia_android.ui.tododocs

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TodoView(innerPadding: PaddingValues) {
    Box(
        modifier = Modifier.padding(innerPadding)
    ) {
        Column {
            repeat(6) {
                TodoItem()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TodoViewPreview() {
    TodoView(PaddingValues(5.dp))
}