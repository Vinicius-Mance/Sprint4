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
    <link rel="stylesheet" href="./css/header.css">
    <title>Deletar usu�rios</title>
    <link rel="icon" href="./img/gitgoodLogo.png">
  </head>
  <body>
    <header>
      <nav>
        <ul>
          <img src="./img/white-logo.svg" alt="BlueBenx">
          <li><a href="usuarios.jsp">Ver usu�rios</a></li>
          <li><a href="deletar.jsp">Deletar usu�rios</a></li>
          <li><a href="alterar.jsp">Alterar usu�rios</a></li>
        </ul>
      </nav>
    </header>

    <main>
    <form action="${pageContext.request.contextPath}/deleta" method="post">
      <span>Coloque o e-mail do usuário que deseja deletar</span>
      <label for="id">ID</label>
      <input type="email" name="email" value="">
    </form>
    </main>
    <script type="text/javascript" src="./js/deletar.js"></script>
  </body>
</html>
