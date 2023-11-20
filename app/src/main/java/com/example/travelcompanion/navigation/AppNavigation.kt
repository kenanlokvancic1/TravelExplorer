package com.example.travelcompanion.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.travelcompanion.screens.DashboardScreen
import com.example.travelcompanion.screens.LoginScreen
import com.example.travelcompanion.screens.SignUpScreen

@Composable
fun AppNavigation(){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.SignUpScreen.route){
        composable(route = Screen.SignUpScreen.route){
            SignUpScreen(navController = navController)
        }
        composable(
            route = Screen.DashboardScreen.route,
            arguments = listOf(
                navArgument("name"){
                    type = NavType.StringType
                }
            )
        ){
            navController.navigate(Screen.DashboardScreen.route)
        }

    }

}

