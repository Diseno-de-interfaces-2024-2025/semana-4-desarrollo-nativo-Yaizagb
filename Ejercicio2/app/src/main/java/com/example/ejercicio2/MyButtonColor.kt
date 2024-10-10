package com.example.ejercicio2;

import android.graphics.Color
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ButtonColor(string: String, color: Color) {
    var button by remember { mutableStateOf(false) }
        Button(onClick = { button = !button }, border = BorderStroke(2.dp, Color.BLACK)) {
            if (button) {
                Text("Botón pulsado")
            } else {
                Text("Pulsa aquí")


            }
            }

}