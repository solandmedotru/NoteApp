package ru.soland.noteapp.feature_note.presentation.notes

import ru.soland.noteapp.feature_note.domain.model.Note
import ru.soland.noteapp.feature_note.domain.util.NoteOrder
import ru.soland.noteapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
