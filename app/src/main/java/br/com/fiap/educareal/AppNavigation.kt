package br.com.fiap.educareal

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.fiap.educareal.ui.theme.DarkPurple
import br.com.fiap.educareal.ui.theme.FinancialWhite
import kotlinx.coroutines.launch

@Composable
fun AppNavigation(navController: NavHostController) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(
                drawerContainerColor = DarkPurple,
            ) {
                Box(
                    modifier = Modifier.height(100.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "Menu", color = FinancialWhite, modifier = Modifier.padding(16.dp))
                }
                NavigationDrawerItem(
                    label = { Text("Dashboard", color = FinancialWhite) },
                    selected = false,
                    onClick = {
                        navController.navigate("dashboard")
                        scope.launch { drawerState.close() }
                    }
                )
                NavigationDrawerItem(
                    label = { Text("Cursos", color = FinancialWhite) },
                    selected = false,
                    onClick = {
                        navController.navigate("courses")
                        scope.launch { drawerState.close() }
                    }
                )
                NavigationDrawerItem(
                    label = { Text("Livros", color = FinancialWhite) },
                    selected = false,
                    onClick = {
                        navController.navigate("books")
                        scope.launch { drawerState.close() }
                    }
                )
                NavigationDrawerItem(
                    label = { Text("Artigos", color = FinancialWhite) },
                    selected = false,
                    onClick = {
                        navController.navigate("articles")
                        scope.launch { drawerState.close() }
                    }
                )
                NavigationDrawerItem(
                    label = { Text("Notícias", color = FinancialWhite) },
                    selected = false,
                    onClick = {
                        navController.navigate("news")
                        scope.launch { drawerState.close() }
                    }
                )
                NavigationDrawerItem(
                    label = { Text("Perfil do Usuário", color = FinancialWhite) },
                    selected = false,
                    onClick = {
                        navController.navigate("userProfile")
                        scope.launch { drawerState.close() }
                    }
                )
            }
        },
        gesturesEnabled = true,
        modifier = Modifier.fillMaxSize()
    ) {
        NavHost(navController = navController, startDestination = "dashboard") {
            composable("dashboard") {
                DashboardScreen()
            }
            composable("courses") {
                CoursesScreen(navController = navController)
            }
            composable("books") {
                BooksScreen()
            }
            composable("articles") {
                ArticlesScreen()
            }
            composable("news") {
                NewsScreen(navController = navController)
            }
            composable("userProfile") {
                UserProfileScreen()
            }
        }
    }
}