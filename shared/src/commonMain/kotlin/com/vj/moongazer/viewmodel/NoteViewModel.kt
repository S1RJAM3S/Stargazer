package com.vj.moongazer.viewmodel

import androidx.lifecycle.ViewModel
import com.vj.moongazer.model.Note
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class NoteUiState(
    val notes: List<Note> = emptyList()
)
class NoteViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(NoteUiState())
    val uiState: StateFlow<NoteUiState> = _uiState.asStateFlow()

    fun addNote(note: Note) {
        _uiState.update { currentState ->
            currentState.copy(
                notes = currentState.notes + note
            )
        }
    }

    fun removeNote(note: Note) {
        _uiState.update { currentState ->
            currentState.copy(
                notes = currentState.notes.filter { it != note }
            )
        }
    }
}