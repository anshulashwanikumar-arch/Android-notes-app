package com.example.myapplication

import kotlinx.coroutines.flow.Flow

class NoteRepository(
    private val noteDao: NoteDao
) {

    val allNotes: Flow<List<Note>> =
        noteDao.getAllNotes()

    suspend fun addNote(note: Note) {
        noteDao.insertNote(note)
    }
}