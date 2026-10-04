package com.example.ariketa2zoriontzekotxartela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ariketa2zoriontzekotxartela.ui.theme.Ariketa2ZoriontzekoTxartelaTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ariketa2ZoriontzekoTxartelaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ZorionakTestua(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ZorionakTestua(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.fondoa),
            contentDescription = "Gabonetako fondoa",
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier.fillMaxSize().padding(horizontal = 24.dp, vertical = 80.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            Text(
                text = "Zorionak",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFF5252)
            )

            Text(
                text = "eta",
                fontSize = 30.sp,
                color = Color.White
            )

            Text(
                text = "Urte Berri On!",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF69F0AE)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ZorionakTestuaPreview() {
    Ariketa2ZoriontzekoTxartelaTheme {
        ZorionakTestua()
    }
}



