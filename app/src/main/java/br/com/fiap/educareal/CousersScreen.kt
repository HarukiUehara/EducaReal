package br.com.fiap.educareal

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import br.com.fiap.educareal.ui.theme.DarkPurple
import br.com.fiap.educareal.ui.theme.FinancialWhite
import br.com.fiap.educareal.ui.theme.Typography

data class Course(val title: String, val url: String)

@Composable
fun CoursesScreen(navController: NavHostController) {
    val context = LocalContext.current
    val courses = listOf(
        Course("Introdução à Educação Financeira", "https://example.com/course1"),
        Course("Orçamento Pessoal para Iniciantes", "https://example.com/course2"),
        Course("Como economizar dinheiro", "https://example.com/course3"),
        Course("Planejamento de Investimentos", "https://example.com/course4")
    )

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Cursos Disponíveis",
            style = Typography.displayMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 24.dp)
        )
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 8.dp)
        ) {
            items(courses) { course ->
                CourseCard(course = course, onClick = {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(course.url))
                    context.startActivity(intent)
                })
            }
        }
    }
}

@Composable
fun CourseCard(course: Course, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        colors = CardDefaults.cardColors(
            containerColor = DarkPurple,
            contentColor = FinancialWhite
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Filled.School,
                contentDescription = "Ícone de Curso",
                modifier = Modifier.size(40.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = course.title,
                style = Typography.bodyLarge,
                fontWeight = FontWeight.Bold
            )
        }
    }
}