package com.example.calculatoranapupo.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable

@Composable
fun Operators(onOperadorSelecionado: (String) -> Unit) {
    val simbolos = listOf("+", "-", "*", "/")
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = androidx.compose.ui.Modifier.fillMaxWidth()
    ) {
        simbolos.forEach { simbolo ->
            OperatorButton(simbolo = simbolo, onClick = { onOperadorSelecionado(simbolo) })
        }
    }
}
