package com.example.notesapp.feature_note.domain.usecase

data class NoteUseCases(
    val getNotes: GetNotesUseCase,
    val deleteNote: DeleteNoteUseCase,
    val addNote: AddNoteUseCase,
//    val getNote: GetNote

)