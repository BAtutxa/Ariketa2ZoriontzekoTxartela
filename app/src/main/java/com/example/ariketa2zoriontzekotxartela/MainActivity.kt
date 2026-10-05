package com.example.zorionaktxartela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ariketa2zoriontzekotxartela.ui.theme.Ariketa2ZoriontzekoTxartelaTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ariketa2ZoriontzekoTxartelaTheme() {
                TarjetaFelicitacion(nombre = "Borja", remitente = "Iker")
            }
        }
    }
}

@Composable
fun TarjetaFelicitacion(nombre: String, remitente: String, modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.androidirudia),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Zorionak $nombre!",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )
            Spacer(modifier = Modifier.height(100.dp))
            Text(
                text = "Alde batetik: $remitente",
                fontSize = 20.sp
            )

            var testua by remember { mutableStateOf("") }

            Text( text = testua,
                fontSize = 40.sp,
                color = Color.Green)
            Button(
                onClick = { testua = "kaixo mundua" },
                modifier = Modifier.padding(20.dp)
            ) {
                Text(text = "Klikatu")
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun TarjetaFelicitacionPreview() {
    Ariketa2ZoriontzekoTxartelaTheme() {
        TarjetaFelicitacion(nombre = "Borja", remitente = "Iker")
    }
}