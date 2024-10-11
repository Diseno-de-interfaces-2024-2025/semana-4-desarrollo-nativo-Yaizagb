package com.example.ejercicio3
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejercicio3.ui.theme.Ejercicio3Theme
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    var validationMessage by remember { mutableStateOf("") }
    var messageColor by remember { mutableStateOf(Color.Transparent) }
    Box(Modifier.fillMaxSize()) {
        Column(modifier = modifier.align(alignment = Alignment.Center)) {
            TextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Usuario") }
            )
            Spacer(Modifier.height(40.dp))
            TextField(
                value = text2,
                onValueChange = { text2 = it },
                label = { Text("Contraseña") }
            )
            Spacer(Modifier.height(10.dp))
            Text(
                text = validationMessage,
                color = messageColor,
                modifier = Modifier.padding(8.dp)
            )
            Button(onClick = {
                // Lógica de validación
                if (text == "usuario" && text2 == "12345") {
                    validationMessage = "Usuario Correcto"
                    messageColor = Color.Green
                } else {
                    validationMessage = "Usuario Incorrecto"
                    messageColor = Color.Red
                }
            }) {
                Text("Acceder")
            }
        }

    }
}

