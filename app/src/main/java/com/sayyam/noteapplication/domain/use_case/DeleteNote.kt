package com.sayyam.noteapplication.domain.use_case

import com.sayyam.noteapplication.domain.model.Note
import com.sayyam.noteapplication.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}