package com.sayyam.noteapplication.domain.use_case

import com.sayyam.noteapplication.domain.model.Note
import com.sayyam.noteapplication.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}