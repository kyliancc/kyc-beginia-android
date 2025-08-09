package com.kyliancc.beginia_android.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kyliancc.beginia_android.data.http.BeginiaClient
import com.kyliancc.beginia_android.model.CpltDocItem
import com.kyliancc.beginia_android.model.TodoDocItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class DocsViewModel @Inject constructor() : ViewModel() {
    private val _todoDocs = MutableStateFlow<List<TodoDocItem>>(emptyList())
    val todoDocs: StateFlow<List<TodoDocItem>> = _todoDocs

    private val _cpltDocs = MutableStateFlow<List< CpltDocItem>>(emptyList())
    val cpltDocs: StateFlow<List<CpltDocItem>> = _cpltDocs

    init {
        viewModelScope.launch {
            try {
                var allDocs = BeginiaClient.docsService.getAllDocs()
                _todoDocs.value = allDocs.todo
                _cpltDocs.value = allDocs.cplt
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}