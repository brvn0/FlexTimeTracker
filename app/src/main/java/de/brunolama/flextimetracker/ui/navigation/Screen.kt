package de.brunolama.flextimetracker.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val title: String, val icon: ImageVector) {
    object Home : Screen("home", "Home", Icons.Filled.Home)
    object Statistics : Screen("statistics", "Statistics", Icons.Filled.DateRange)
    object Settings : Screen("settings", "Settings", Icons.Filled.Settings)
}