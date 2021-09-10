<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/global.css">
    <link rel="stylesheet" href="./css/style.css">
    <title>Página inicial</title>
    <link rel="icon" href="./img/gitgoodLogo.png">
  </head>
  <body>
    <main id="pagPrincipal">
      <img class="logoPagina" src="./img/white-logo.svg" alt="BlueBenx Logo">
      <div id="divBotoesPagPrincipal">
          <button type="button" id="botaoAbrirConta" name="abrirConta">Abrir Conta</button>
          <button type="button" id="botaoJaTenhoConta" name="jaTenhoConta">Já Tenho Conta</button>
          <span id="lerMaisSobre">Sobre a BlueBenx <br>
            <a id="ancoraAbrirLerMaisSobre" href="#pagLerMaisSobre"></a>
            <img id="setaLerMaisSobre" src="./img/white-arrow.png" alt="seta branca">
          </span>
      </div>
    </main>
    <main id="pagLerMaisSobre">
        <img class="logoPagina" src="./img/logo.svg" alt="BlueBenx Logo">
        <img id="bannerlerMais" src="./img/bluebenxdrawings.jpeg" alt="drawings">
          <h1>Conheça a BlueBenx</h1>
            <p>Somos especialistas em tecnologia financeira com foco em áreas estratégicas de crescimento do mercado digital de criptomoedas. Desenvolvemos produtos e soluções de negócios que dão acesso seguro e com exposição estratégica aos principais ativos digitais do mundo, para pessoas interessadas e corporações</p>
        <a href="#pagPrincipal">Voltar</a>
    </main>
    <script type="text/javascript" src="./js/functions.js"></script>
  </body>
</html>
