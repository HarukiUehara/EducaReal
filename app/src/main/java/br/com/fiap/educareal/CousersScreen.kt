package br.com.fiap.educareal

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.fiap.educareal.ui.theme.Typography

data class Course(val title: String, val url: String)

@Composable
fun CoursesScreen(navController: NavHostController) {
    val context = LocalContext.current
    val courses = listOf(
        Course("Introdução à Educação Financeira", "https://example.com/course1"),
        Course("Orçamento Pessoal para Iniciantes", "https://example.com/course2"),
        Course("Como economizar dinheiro", "https://example.com/course3")
    )

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Cursos Disponíveis",
            style = Typography.displayMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp)
        ) {
            items(courses) { course ->
                Text(
                    text = course.title,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(course.url))
                            context.startActivity(intent)
                        }
                        .padding(vertical = 8.dp)
                )
            }
        }
    }
}