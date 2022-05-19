package com.example.belajarcompose.navigation

sealed class Screen(
    val route:String
){
    object Home:Screen("home_screen")
    object Second:Screen("second_screen")
}
