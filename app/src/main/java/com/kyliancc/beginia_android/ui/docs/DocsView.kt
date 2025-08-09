package com.kyliancc.beginia_android.ui.docs

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.kyliancc.beginia_android.ui.viewmodel.DocsViewModel

@Composable
fun DocsView(innerPadding: PaddingValues, viewModel: DocsViewModel = hiltViewModel()) {
    val state = viewModel.todoDocs.collectAsState()

    Box(
        modifier = Modifier.padding(innerPadding)
    ) {
        Column {
            for (doc in state.value) {
                TodoDocItemView(doc)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DocsViewPreview() {
    DocsView(PaddingValues(5.dp))
}