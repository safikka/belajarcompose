package com.example.belajarcompose.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class ScreenClass(
    val id:String,
    val title:String,
    val icon:ImageVector
){
    object Home: ScreenClass("home", "Home", Icons.Outlined.Home)
    object Riwayat: ScreenClass("riwayat", "Riwayat", Icons.Outlined.ShoppingCart)
    object Setting: ScreenClass("setting", "Setting", Icons.Outlined.Settings)

    object Items{
        val list= listOf<ScreenClass>(
            Home, Riwayat, Setting
        )
    }
}
