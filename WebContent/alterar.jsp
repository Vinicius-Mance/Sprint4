<%@page import="br.com.agile.beans.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="br.com.agile.conexao.Conexao" %>
    <%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html lang="pt-br" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/global.css">
    <link rel="stylesheet" href="./css/usuarios.css">
    <link rel="stylesheet" href="./css/forms.css">
    <title>Alterar usuários</title>
    <link rel="icon" href="./img/gitgoodLogo.png">
  </head>
  <body>
    <jsp:include page="./assets/header.jsp"></jsp:include>
      <main>
      <form class="" action="${pageContext.request.contextPath}/altera" method="post">

        <div class="campos">
          <span>Insira do email do usuário a ser alterado</span>
          <label for="email">Email a ser alterado
            <input type="email" name="email" value="" placeholder="email@hotmail.com">
        </label>
        </div>

        <div class="campos">

          <span>Insira a nova senha</span>

          <div id="grupoSenha">

            <label for="campoSenha">
                Nova senha
            </label>

            <input type="password" id="campoSenha" name="senha" placeholder="*********">

            <div id="iconesOlhos">
              <img src="./img/eye-icon.svg" id="verSenha" alt="ver senha">
              <img src="./img/closed-eye-icon.png" id="esconderSenha" alt="ver senha">
            </div>

          </div>

          <span class="erro" id="erroSenha"></span>
        </div>
            <button type="submit" name="button">Atualizar senha</button>
      </form>
    </main>

    <script type="text/javascript" src="./js/alterar.js"></script>
  </body>
</html>
