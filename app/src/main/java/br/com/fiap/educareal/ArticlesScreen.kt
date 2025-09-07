package br.com.fiap.educareal

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import br.com.fiap.educareal.ui.theme.DarkPurple
import br.com.fiap.educareal.ui.theme.FinancialWhite
import br.com.fiap.educareal.ui.theme.Typography

data class Article(val title: String, val summary: String)

@Composable
fun ArticlesScreen() {
    val articles = listOf(
        Article("Primeiros Passos para Investir", "Um guia completo para quem quer começar a investir."),
        Article("Como Fazer um Orçamento Pessoal", "Estratégias para organizar suas finanças e economizar."),
        Article("Entendendo a Bolsa de Valores", "O que é, como funciona e por que é importante para o mercado."),
        Article("O Impacto da Tecnologia no Mercado Financeiro", "A revolução dos bancos digitais e fintechs."),
        Article("Planejamento Financeiro para o Futuro", "Dicas para poupar e investir visando a aposentadoria."),
        Article("Gerenciando Dívidas de Forma Eficiente", "Passos práticos para sair do vermelho e ter saúde financeira."),
        Article("Bitcoin e Criptomoedas", "Uma introdução ao mundo das moedas digitais e seus riscos.")
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(FinancialWhite)
            .padding(16.dp)
    ) {
        Text(
            text = "Artigos sobre Finanças",
            style = Typography.displayMedium.copy(fontWeight = FontWeight.Bold),
            color = DarkPurple,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(articles) { article ->
                ArticleItem(article)
            }
        }
    }
}

@Composable
fun ArticleItem(article: Article) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(DarkPurple)
            .padding(16.dp)
    ) {
        Text(
            text = article.title,
            style = Typography.displaySmall,
            color = FinancialWhite,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = article.summary,
            style = Typography.displaySmall,
            color = FinancialWhite.copy(alpha = 0.7f)
        )
    }
}