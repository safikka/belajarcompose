package com.example.belajarcompose.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route:String,
    val tittle:String,
    val icon:ImageVector
){
    object Beranda:BottomBarScreen(
        route = "beranda",
        tittle = "Beranda",
        icon = Icons.Default.Home
    )
    object Riwayat:BottomBarScreen(
        route = "riwayat",
        tittle = "Riwayat",
        icon = Icons.Default.Search
    )
    object Pengaturan:BottomBarScreen(
        route = "pengaturan",
        tittle = "Pengaturan",
        icon = Icons.Default.Settings
    )
}
