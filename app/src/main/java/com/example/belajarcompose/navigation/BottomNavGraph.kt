package com.example.belajarcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.belajarcompose.screens.HistoryScreen
import com.example.belajarcompose.screens.HomeScreen
import com.example.belajarcompose.screens.SettingScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route,
    ) {
        composable(route = BottomBarScreen.Home.route){
            HomeScreen()
        }
        composable(route = BottomBarScreen.History.route){
            HistoryScreen()
        }
        composable(route = BottomBarScreen.Setting.route){
            SettingScreen()
        }
    }
}