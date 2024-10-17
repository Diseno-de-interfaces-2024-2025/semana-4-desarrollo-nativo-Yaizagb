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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
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
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    var text1 by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    var text3 by remember { mutableStateOf("") }
    var text4 by remember { mutableStateOf("") }
    var displayedText1 by remember { mutableStateOf("") }
    var displayedText2 by remember { mutableStateOf("") }
    var displayedText3 by remember { mutableStateOf("") }
    var displayedText4 by remember { mutableStateOf("") }
    Column(Modifier.fillMaxSize()) {
        Box(Modifier.fillMaxWidth().height(40.dp)){}
        // Primer Box con pantalla negra y texto "Screen"
        Box(Modifier.fillMaxWidth().height(80.dp).background(Color.Black)) {
            Text("Screen", color = Color.White, modifier = Modifier.align(Alignment.Center),fontSize = 30.sp)
        }

        // Primera fila horizontal scrollable vacía
        Row(Modifier.horizontalScroll(rememberScrollState()).background(Color.LightGray)) {
            repeat(10) { // Repetimos para dibujar 10 círculos
                Canvas(modifier = Modifier.size(60.dp).padding(end = 8.dp)) {
                    drawCircle(color = Color(0xFFA52A2A)) // Marrón
                }
            }
        }

        // Segunda fila con dos Box
        Row(Modifier.fillMaxWidth()) {
            // Primer Box con color Cyan
            Box(Modifier.weight(1f).height(250.dp).padding(10.dp).background(Color.Cyan)) {

            }

            // Scrollable vertical Box
            Box(Modifier.weight(1f).height(250.dp).verticalScroll(rememberScrollState())) {
                Text(
                    "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                    modifier = Modifier.padding(16.dp)
                )
            }
        }

        Text("FORMULARIO",modifier.align(alignment = Alignment.CenterHorizontally),fontSize = 30.sp,);
        // Sección del formulario
        Column(Modifier.fillMaxWidth()) {
            // Nombre
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                TextField(
                    value = text1,
                    onValueChange = { text1 = it },
                    label = { Text("Nombre") },
                    modifier = Modifier.width(250.dp).padding(10.dp)
                )
                Box(modifier = Modifier.fillMaxWidth().weight(1f)) {
                    Text(
                        displayedText1,
                        modifier = Modifier.align(Alignment.Center) // Centrar el texto en su espacio
                    )
                }
            }

            // Email
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                TextField(
                    value = text2,
                    onValueChange = { text2 = it },
                    label = { Text("Email") },
                    modifier = Modifier.width(250.dp).padding(10.dp)
                )
                Box(modifier = Modifier.fillMaxWidth().weight(1f)) {
                    Text(
                        displayedText2,
                        modifier = Modifier.align(Alignment.Center) // Centrar el texto en su espacio
                    )
                }
            }

            // Dirección
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                TextField(
                    value = text3,
                    onValueChange = { text3 = it },
                    label = { Text("Dirección") },
                    modifier = Modifier.width(250.dp).padding(10.dp)
                )
                Box(modifier = Modifier.fillMaxWidth().weight(1f)) {
                    Text(
                        displayedText3,
                        modifier = Modifier.align(Alignment.Center) // Centrar el texto en su espacio
                    )
                }
            }

            // País
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                TextField(
                    value = text4,
                    onValueChange = { text4 = it },
                    label = { Text("País") },
                    modifier = Modifier.width(250.dp).padding(10.dp)
                )
                Box(modifier = Modifier.fillMaxWidth().weight(1f)) {
                    Text(
                        displayedText4,
                        modifier = Modifier.align(Alignment.Center) // Centrar el texto en su espacio
                    )
                }
            }
        }
        Button(onClick = {
            displayedText1 = text1
            displayedText2 = text2
            displayedText3 = text3
            displayedText4 = text4
        }, modifier = Modifier.padding(top = 16.dp).align(alignment = Alignment.CenterHorizontally)) {
            Text("Actualizar")
        }
    }
}
