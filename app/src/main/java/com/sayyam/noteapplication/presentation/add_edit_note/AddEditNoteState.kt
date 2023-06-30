package com.sayyam.noteapplication.presentation.add_edit_note

data class AddEditNoteState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)