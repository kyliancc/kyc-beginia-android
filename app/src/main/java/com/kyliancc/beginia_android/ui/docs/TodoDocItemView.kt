package com.kyliancc.beginia_android.ui.docs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Done
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kyliancc.beginia_android.model.TodoDocItem
import java.util.Date

@Composable
fun TodoDocItemView(doc: TodoDocItem) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(doc.name)
        Row {
            IconButton(onClick = {}) {
                Icon(Icons.Outlined.Edit, null)
            }
            IconButton(onClick = {}) {
                Icon(Icons.Outlined.Done, null)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TodoDocItemViewPreview() {
    TodoDocItemView(
        TodoDocItem(1, Date(), "test", "test", 1, mutableListOf("abc")))
}