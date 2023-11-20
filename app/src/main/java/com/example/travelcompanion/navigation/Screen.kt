package com.example.travelcompanion.navigation

sealed class Screen(val route: String){
    object SignUpScreen : Screen("signup_screen")
    object LogInScreen : Screen("login_screen")
    object DashboardScreen : Screen("dashboard_screen")
    object TravelPlanScreen : Screen("travelplan_screen")
    object WishlistScreen : Screen("wishlist_screen")
}
