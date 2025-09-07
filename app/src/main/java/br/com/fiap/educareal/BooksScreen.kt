package br.com.fiap.educareal

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.educareal.ui.theme.DarkPurple
import br.com.fiap.educareal.ui.theme.FinancialWhite
import br.com.fiap.educareal.ui.theme.Typography

data class Book(val title: String, val author: String)

@Composable
fun BooksScreen() {
    val books = listOf(
        Book("Princípios Judaicos Para a Prosperidade Financeira", "Dov Gilvanci Levi"),
        Book("Uma chefe em mim", "Nathalia Arcuri"),
        Book("Psicologia financeira", "Morgan"),
        Book("Tudo que você precisa saber sobre economia", "William Gibson"),
        Book("Hábitos Atômicos", "James Clear"),
        Book("O Poder do Hábito", "Charles Duhigg")
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(FinancialWhite)
            .padding(16.dp)
    ) {
        Text(
            text = "Livros Recomendados",
            style = Typography.displayMedium.copy(fontWeight = FontWeight.Bold),
            color = DarkPurple,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(books) { book ->
                BookItem(book)
            }
        }
    }
}

@Composable
fun BookItem(book: Book) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(DarkPurple)
            .padding(16.dp)
    ) {
        Text(
            text = book.title,
            style = Typography.displaySmall,
            color = FinancialWhite,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = book.author,
            style = Typography.displaySmall.copy(fontSize = 14.sp),
            color = FinancialWhite.copy(alpha = 0.7f)
        )
    }
}