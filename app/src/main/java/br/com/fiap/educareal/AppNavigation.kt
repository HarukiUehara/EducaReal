package br.com.fiap.educareal

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "menu") {
        composable("menu") {
            // Em breve, vamos criar uma tela de menu.
            // Por enquanto, ela pode redirecionar para uma das outras telas
        }
        composable("courses") {
            CoursesScreen()
        }
        composable("books") {
            BooksScreen()
        }
        composable("articles") {
            ArticlesScreen()
        }
        composable("news") {
            NewsScreen()
        }
        composable("userProfile") {
            UserProfileScreen()
        }
    }
}