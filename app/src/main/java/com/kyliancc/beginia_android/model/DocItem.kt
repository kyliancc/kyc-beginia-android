package com.kyliancc.beginia_android.model

import java.util.Date

data class TodoDocItem(
    val id: Int,
    val created: Date,
    var name: String,
    var comment: String,
    var priority: Int,
    var labels: MutableList<String>
)

data class CpltDocItem(
    val id: Int,
    val created: Date,
    val completed: Date,
    var name: String,
    var comment: String,
    var labels: MutableList<String>
)

data class AllDocItems(
    val todo: List<TodoDocItem>,
    val cplt: List<CpltDocItem>
)

data class DocSwitches(
    val pairs: List<List<Int>>
)