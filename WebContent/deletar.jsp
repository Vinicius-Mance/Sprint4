<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="pt-br" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/global.css">
    <link rel="stylesheet" href="./css/usuarios.css">
    <title>Deletar usuários</title>
    <link rel="icon" href="./img/gitgoodLogo.png">
  </head>
  <body>
    <header>
    <link rel="stylesheet" href="./css/header.css">
      <nav>
        <ul>
          <img src="./img/white-logo.svg" alt="BlueBenx">
          <li><a href="usuarios.jsp">Ver usuários</a></li>
          <li><a href="deletar.jsp">Deletar usuários</a></li>
          <li><a href="alterar.jsp">Alterar usuários</a></li>
        </ul>
      </nav>
    </header>

    <main>

      <table>
        <tr>
          <th>ID</th>
          <th>Nome</th>
          <th>Email</th>
          <th>Senha</th>
          <th>Número de telefone</th>
          <th>CPF</th>
        </tr>
        <tr>
          <td>1</td>
          <td>Vinicius</td>
          <td>vinimance@gmail.com</td>
          <td>1234</td>
          <td>9-9933-5399</td>
          <td>507.564.598.42</td>
        </tr>
      </table>

    </main>

    <script type="text/javascript" src="./js/usuarios.js"></script>
  </body>
</html>
