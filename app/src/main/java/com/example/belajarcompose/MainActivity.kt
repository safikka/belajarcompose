package com.example.belajarcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.belajarcompose.ui.theme.BelajarComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BelajarComposeTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Text(text = "Hello World")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BelajarComposeTheme {
        MainScreen()
    }
}