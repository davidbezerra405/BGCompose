package com.example.bgcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bgcompose.ui.theme.BGComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BGComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingTuto()
                }
            }
        }
    }
}

@Composable
fun GreetingTuto(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Box(modifier) {
        Column() {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.FillWidth
            )
            Text(
                text = stringResource(R.string.txt_tema),
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(16.dp)
                    .align(alignment =  Alignment.CenterHorizontally)

            )
            Text(
                text = stringResource(R.string.txt_texto1),
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )
            Text(
                text = stringResource(R.string.txt_texto2),
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BGComposeTheme {
        GreetingTuto()
    }
}