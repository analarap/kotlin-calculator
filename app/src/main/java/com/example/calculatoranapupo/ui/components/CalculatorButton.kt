package com.example.calculatoranapupo.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun CalculatorButton(
    valor1: String,
    valor2: String,
    operador: String,
    onResultado: (String) -> Unit
) {
    Button(onClick = {
        val n1 = valor1.toDoubleOrNull()
        val n2 = valor2.toDoubleOrNull()

        if (n1 == null || n2 == null || operador.isEmpty()) {
            onResultado("Há algum problema, tente novamente ;)!")
        } else {
            val res = when (operador) {
                "+" -> n1 + n2
                "-" -> n1 - n2
                "*" -> n1 * n2
                "/" -> if (n2 != 0.0) n1 / n2 else "Erro"
                else -> "Erro"
            }
            onResultado(res.toString())
        }
    }) {
        Text("Calcular")
    }
}
