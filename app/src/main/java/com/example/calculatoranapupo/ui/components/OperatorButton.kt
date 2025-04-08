package com.example.calculatoranapupo.ui

import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun OperatorButton(simbolo: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .defaultMinSize(minWidth = 50.dp)
    ) {
        Text(simbolo)
    }
}
