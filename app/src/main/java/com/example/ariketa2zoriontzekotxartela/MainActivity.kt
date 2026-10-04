package com.example.ariketa2zoriontzekotxartela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisallowComposableCalls
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ariketa2zoriontzekotxartela.ui.theme.Ariketa2ZoriontzekoTxartelaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ariketa2ZoriontzekoTxartelaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Zorionak(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Zorionak(modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize()){
        ZorionakIrudia()
        ZorionakTestua()
    }
}

@Composable
fun ZorionakTestua(modifier: Modifier = Modifier){
    Column(modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center) {
        Text(
            text = "Zorionak 3PAG2!!",
            fontSize = 70.sp,
            textAlign = TextAlign.Center,
            lineHeight = 80.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)

        )
        Text(
            text="3PAG2Ko irakasleen partetik",
            textAlign = TextAlign.Right,
            modifier = Modifier
                .padding(15.dp)
                .fillMaxWidth()
        )
    }
}
@Composable
fun ZorionakIrudia (modifier:Modifier = Modifier){
    val image = painterResource(R.drawable.androidirudia)
    Image(
        painter = image,
        contentDescription = null,
        modifier= Modifier.fillMaxSize()
    )
}

@Preview(showBackground = true)
@Composable
fun ZorionakTestuaPreview() {
    Ariketa2ZoriontzekoTxartelaTheme {
        Zorionak()
    }
}