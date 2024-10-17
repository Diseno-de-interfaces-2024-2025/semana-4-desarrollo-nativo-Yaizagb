package com.example.ejercicio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejercicio4.ui.theme.Ejercicio4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxSize()) {
        // Primer Box con pantalla negra y texto "Screen"
        Box(Modifier.fillMaxWidth().height(100.dp).background(Color.Black)) {
            Text("Screen", color = Color.White, modifier = Modifier.align(Alignment.Center))
        }

        // Primera fila horizontal scrollable vacía
        Row(Modifier.horizontalScroll(rememberScrollState()).padding(10.dp).background(Color.LightGray)) {
            repeat(10) { // Repetimos para dibujar 10 círculos
                Canvas(modifier = Modifier.size(60.dp).padding(end = 8.dp)) {
                    drawCircle(color = Color(0xFFA52A2A)) // Marrón
                }
            }
        }

        // Segunda fila con dos Box
        Row(Modifier.fillMaxWidth()) {
            // Primer Box con color Cyan
            Box(Modifier.weight(1f).height(200.dp).padding(10.dp).background(Color.Cyan)) {
                // Puedes agregar contenido aquí si lo necesitas
            }

            // Scrollable vertical Box
            Box(Modifier.weight(1f).height(200.dp).verticalScroll(rememberScrollState())) {
                Text(
                    "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                    modifier = Modifier.padding(16.dp)
                )
            }
        }

        // Sección del formulario
        Row(Modifier.fillMaxWidth()){
        Column(Modifier.padding(16.dp)) {
            Text("FORMULARIO")

            var text1 by remember { mutableStateOf("") }
            var text2 by remember { mutableStateOf("") }
            var text3 by remember { mutableStateOf("") }
            var text4 by remember { mutableStateOf("") }

            // Campos de texto para el formulario
            TextField(
                value = text1,
                onValueChange = { text1 = it },
                label = { Text("Usuario 1") },
                modifier = Modifier.fillMaxWidth().padding(20.dp)
            )
            TextField(
                value = text2,
                onValueChange = { text2 = it },
                label = { Text("Usuario 2") },
                modifier = Modifier.fillMaxWidth().padding(20.dp)
            )
            TextField(
                value = text3,
                onValueChange = { text3 = it },
                label = { Text("Usuario 3") },
                modifier = Modifier.fillMaxWidth().padding(20.dp)
            )
            TextField(
                value = text4,
                onValueChange = { text4 = it },
                label = { Text("Usuario 4") },
                modifier = Modifier.fillMaxWidth().padding(20.dp)
            )

            // Botón de actualizar

        }
            Column(Modifier.fillMaxWidth()) {
                Text("");
                Text("");
                Text("");
                Text("");
            }
        }
        Button(onClick = {
            // Acción del botón
        }, modifier = Modifier.padding(top = 16.dp)) {
            Text("Actualizar")
        }
    }
}
