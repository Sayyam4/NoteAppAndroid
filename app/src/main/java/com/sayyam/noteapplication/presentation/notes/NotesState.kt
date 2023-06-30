package com.sayyam.noteapplication.presentation.notes

import com.sayyam.noteapplication.domain.model.Note
import com.sayyam.noteapplication.domain.util.NoteOrder
import com.sayyam.noteapplication.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)