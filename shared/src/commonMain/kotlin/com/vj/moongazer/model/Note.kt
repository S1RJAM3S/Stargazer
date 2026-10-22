package com.vj.moongazer.model

import kotlin.time.Clock
import kotlin.time.Instant
import kotlin.uuid.Uuid

sealed interface NoteContent {
    data class Text(val text: String) : NoteContent
    data class Image(val imageUrl: String) : NoteContent
}

data class Note(
    val id: String = Uuid.random().toString(),
    val sender: String,
    val timestamp: Instant = Clock.System.now(),
    val content: NoteContent,
)