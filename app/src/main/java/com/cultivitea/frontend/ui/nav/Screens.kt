package com.cultivitea.frontend.ui.nav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.DocumentScanner
import androidx.compose.material.icons.filled.Forum
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val title: String, val icon: ImageVector) {
    object Detector : Screen("detector", "Detector", Icons.Default.DocumentScanner)
    object Forum : Screen("forum", "Forum", Icons.Default.Forum)
    object Profile : Screen("profile", "Profile", Icons.Default.AccountBox)
}
