package com.vj.moongazer

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.vj.moongazer.view.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Moongazer",
    ) {
        App()
    }
}