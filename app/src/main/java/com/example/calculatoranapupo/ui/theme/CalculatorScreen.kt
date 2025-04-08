package com.example.calculatoranapupo.ui

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorScreen(modifier: Modifier = Modifier) {
    var valor1 by remember { mutableStateOf("") }
    var valor2 by remember { mutableStateOf("") }
    var operador by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .padding(16.dp)
            .border(1.dp, Color.Black)
            .padding(16.dp)
    ) {
        Text("Calculadora", fontSize = 24.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(16.dp))

        Text("Valor 1")
        TextField(valor = valor1, onChange = { valor1 = it })

        Spacer(modifier = Modifier.height(16.dp))

        Text("Valor 2")
        TextField(valor = valor2, onChange = { valor2 = it })

        Spacer(modifier = Modifier.height(16.dp))

        Operators(onOperadorSelecionado = { operador = it })

        Spacer(modifier = Modifier.height(16.dp))

        TextField(valor = resultado, enabled = false)

        Spacer(modifier = Modifier.height(16.dp))

        CalculatorButton(
            valor1 = valor1,
            valor2 = valor2,
            operador = operador,
            onResultado = { resultado = it }
        )
    }
}
