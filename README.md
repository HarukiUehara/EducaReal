### EducaReal 
Um aplicativo móvel desenvolvido para fornecer educação financeira a comunidades de baixa renda. O objetivo do projeto é ajudar os usuários a gerir seus recursos de forma mais eficaz e a construir um futuro financeiro sólido, por meio de conteúdos acessíveis e ferramentas práticas.
###

### Funcionalidades

<li>Dashboard Inicial: A tela principal que saúda o usuário com o nome do aplicativo "EducaReal", servindo como ponto central da aplicação.</li>

<li>Menu Lateral Minimalista: Uma barra de navegação lateral permite acesso rápido a todas as seções do app. O design é minimalista e segue a paleta de cores do projeto.</li>

<li>Cursos: Uma lista de cursos de educação financeira apresentada em um design de cartões elegante e clicável. Cada cartão redireciona para um site externo com o conteúdo do curso.</li>

<li>Notícias: Uma seção dedicada a notícias e artigos relevantes sobre finanças, com um layout de cartões que melhora a visualização e a experiência do usuário.</li>

<li>Artigos: Uma coleção de artigos sobre temas financeiros, seguindo o mesmo padrão de design das outras telas, com links para conteúdo externo.</li>

<li>Livros e Perfil do Usuário: Seções adicionais para expandir o conteúdo e as funcionalidades, com telas de placeholder para futuras implementações.</li>
###

### Tecnologias Utilizadas

<li>Linguagem: Kotlin</li>

<li>UI Toolkit: Jetpack Compose</li>

<li>Navegação: Navigation Compose</li>

<li>Design: A interface do usuário segue um design minimalista, utilizando uma paleta de cores e tipografia personalizadas.</li>

###

### Estrutura do Projeto

<li>MainActivity.kt: Ponto de entrada do aplicativo, responsável por configurar o tema e a navegação inicial.</li>

<li>AppNavigation.kt: Gerencia a navegação entre as diferentes telas do aplicativo, utilizando um ModalNavigationDrawer para o menu lateral.</li>

<li>DashboardScreen.kt: A tela principal que exibe o nome do aplicativo.</li>

<li>CoursesScreen.kt: Contém o código para a tela de Cursos.</li>

<li>NewsScreen.kt: Contém o código para a tela de Notícias.</li>

<li>ArticlesScreen.kt: Contém o código para a tela de Artigos.</li>

<li>BooksScreen.kt: Tela de placeholder para a seção de Livros.</li>

<li>UserProfileScreen.kt: Tela de placeholder para a seção de Perfil do Usuário.</li>

<li>ui/theme/Color.kt: Define a paleta de cores utilizada em todo o aplicativo.</li>

<li>ui/theme/Type.kt: Define a tipografia e os estilos de texto.</li>

###

### Como Executar o Projeto

<li>Clone este repositório para o seu ambiente local.</li>

<li>Abra o projeto no Android Studio.</li>

<li>Aguarde a sincronização do Gradle.</li>

<li>Conecte um dispositivo Android ou inicie um emulador.</li>

<li>Clique no botão Run (ícone de play) para instalar e executar o aplicativo no dispositivo.</li>
