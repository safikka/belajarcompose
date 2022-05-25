package com.example.belajarcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.belajarcompose.screens.BerandaScreen
import com.example.belajarcompose.screens.PengaturanScreen
import com.example.belajarcompose.screens.RiwayatScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = BottomBarScreen.Beranda.route ){
        composable(route = BottomBarScreen.Beranda.route){
            BerandaScreen()
        }
        composable(route = BottomBarScreen.Riwayat.route){
            RiwayatScreen()
        }
        composable(route = BottomBarScreen.Pengaturan.route){
            PengaturanScreen()
        }
    }
}