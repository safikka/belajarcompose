package com.example.belajarcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.belajarcompose.screens.HomeScreen
import com.example.belajarcompose.screens.SecondScreen
import com.example.belajarcompose.ui.theme.BelajarComposeTheme

object NavRoute{
    val SCREEN_1 = "HomeScreen"
    val SCREEN_2 = "SecondScreen"
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BelajarComposeTheme {
                val navController = rememberNavController()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyNavHost(navHostController = navController)
                }
            }
        }
    }
}

@Composable
fun MyNavHost(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = NavRoute.SCREEN_1
    ){
        composable(NavRoute.SCREEN_1){
            HomeScreen{
                navHostController.navigate(NavRoute.SCREEN_2)
            }
        }
        composable(NavRoute.SCREEN_2){
            SecondScreen{
                navHostController.navigate(NavRoute.SCREEN_1)
            }
        }
    }
}

@Composable
fun MainScreen() {
    Text(text = "Hello World")
}