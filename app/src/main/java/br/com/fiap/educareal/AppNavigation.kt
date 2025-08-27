package br.com.fiap.educareal

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "menu") {
        composable("menu") {
            MenuScreen(navController = navController)
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

@Composable
fun MenuScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { navController.navigate("courses") },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = "Cursos")
        }
        Button(
            onClick = { navController.navigate("books") },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = "Livros")
        }
        Button(
            onClick = { navController.navigate("articles") },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = "Artigos")
        }
        Button(
            onClick = { navController.navigate("news") },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = "Notícias")
        }
        Button(
            onClick = { navController.navigate("userProfile") },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = "Perfil do Usuário")
        }
    }
}