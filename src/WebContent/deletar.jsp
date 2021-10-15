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
    <title>Deletar usuários</title>
    <link rel="icon" href="./img/gitgoodLogo.png">
  </head>
  <body>
   <jsp:include page="./assets/header.jsp"></jsp:include>
    <main>
    <p>${message}</p>
    <form action="${pageContext.request.contextPath}/deleta" method="post">

      <div class="campos">
        <span>Coloque o email do usuário a ser deletado</span>

        <label for="campoEmail">
          E-mail
          <input type="email" id="campoEmail" name="email" placeholder="seuemail@hotmail.com">
        </label>
      </div>

          <button type="submit" name="button">Apagar usuário</button>
    </form>
    </main>
  </body>
</html>
