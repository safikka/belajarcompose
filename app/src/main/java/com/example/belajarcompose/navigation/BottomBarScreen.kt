package com.example.belajarcompose.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.Icon
import androidx.compose.material.icons.filled.Receipt

sealed class BottomBarScreen(
    val route:String,
    val tittle:String,
    val icon:ImageVector
){
    object Beranda:BottomBarScreen(
        route = "beranda",
        tittle = "Beranda",
        icon = Icons.Filled.Home
    )
    object Riwayat:BottomBarScreen(
        route = "riwayat",
        tittle = "Riwayat",
        icon = Icons.Default.Receipt
    )
    object Pengaturan:BottomBarScreen(
        route = "pengaturan",
        tittle = "Pengaturan",
        icon = Icons.Default.Settings
    )
}
