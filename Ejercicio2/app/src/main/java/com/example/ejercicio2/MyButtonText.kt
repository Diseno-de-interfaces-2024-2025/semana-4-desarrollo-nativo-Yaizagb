package com.example.ejercicio2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.ejercicio2.ui.theme.Ejercicio2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ButonText(
                        modifier = Modifier.padding(innerPadding)
                    )
                    ButtonColor(
                        modifier = Modifier.padding(innerPadding),
                        color = Color.Cyan,
                        string = "Botón pulsado"
                    )
                }
            }
        }
    }
}

@Composable
fun ButonText(modifier: Modifier = Modifier) {
    var button by remember {mutableStateOf(false)}
    Column (modifier){
        Button(onClick = {button =! button}) {
            if (button) {
                Text("Botón pulsado")
            }
            else
                Text("Pulsa aquí")
        }
    }
}
