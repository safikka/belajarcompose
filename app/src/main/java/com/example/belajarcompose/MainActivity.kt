package com.example.belajarcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.belajarcompose.components.CustomBottomNav
import com.example.belajarcompose.components.ScreenClass
import com.example.belajarcompose.ui.theme.BelajarComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val currentScreen= mutableStateOf<ScreenClass>(ScreenClass.Home)
            BelajarComposeTheme() {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(
                        bottomBar = {
                            CustomBottomNav(currentScreenId = currentScreen.value.id){
                                currentScreen.value=it
                            }
                        }
                    ) {

                    }
                }
            }
        }
    }
}

@Composable
fun MainApp() {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BelajarComposeTheme {
    }
}