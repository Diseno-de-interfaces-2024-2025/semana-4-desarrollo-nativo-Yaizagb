package com.example.ejercicio2;

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun ButtonColor(string: String, color: Color, modifier: Modifier = Modifier) {
    var button by remember { mutableStateOf(false) }

    val buttonColor = if (button) color else Color.DarkGray
    val borderStrokeWidth = if (button) 3.dp else 1.dp
    val shape = if (button) RoundedCornerShape(4.dp) else RoundedCornerShape(20.dp) // Cambia la forma

    Button(
        onClick = { button = !button },
        border = BorderStroke(borderStrokeWidth, Color.Black),  // Cambia el borde dinámicamente
        shape = shape,  // Cambia la forma dinámica
        colors = ButtonDefaults.buttonColors(containerColor = buttonColor),  // Cambia el color de fondo
        modifier = modifier
    ) {
        if (button) {
            Text(string, color = Color.Black)  // Texto cuando el botón está pulsado
        } else {
            Text("Pulsa aquí", color = Color.White)  // Texto cuando no está pulsado
        }
    }
}
