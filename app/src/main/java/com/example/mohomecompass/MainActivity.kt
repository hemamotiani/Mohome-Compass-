package com.example.mohomecompass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.mohomecompass.ui.screen.MainScreen
import com.example.mohomecompass.ui.theme.MohomeCompassTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mohomecompass.ui.screen.MapScreen
import com.example.mohomecompass.ui.screen.ResourceDetailScreen
import com.example.mohomecompass.ui.screen.ResourcesScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "main") {
        composable("main") { MainScreen(navController) }
        composable("resources") { ResourcesScreen(navController) }
        composable("resource_detail/{resourceName}") { backStackEntry ->
            val resourceName = backStackEntry.arguments?.getString("resourceName")
            ResourceDetailScreen(resourceName)
        }
        composable("map") { MapScreen(navController) }
    }
}
