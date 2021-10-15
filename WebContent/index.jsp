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
    <title>Ver usuários</title>
    <link rel="icon" href="./img/gitgoodLogo.png">
  </head>
  <body>
	<jsp:include page="./assets/header.jsp"></jsp:include>
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
      <%
      try {
    	 Connection c = new Conexao().getConnection();

			String sql = "SELECT * FROM usuarios";

			PreparedStatement stmt = c.prepareStatement(sql);
			ResultSet resultado = stmt.executeQuery();
      while(resultado.next()) {
      %>
      <tr>
        <td><%=resultado.getInt("id") %></td>
        <td><%=resultado.getString("nome") %></td>
        <td><%=resultado.getString("email") %></td>
        <td><%=resultado.getString("senha") %></td>
        <td><%=resultado.getString("numero") %></td>
        <td><%=resultado.getString("cpf") %></td>
      </tr>
      <%
      }
      c.close();
      } catch (Exception e) {
     	 e.printStackTrace();
      }
      %>
      </table>
    </main>

    <script type="text/javascript" src="./js/usuarios.js"></script>
  </body>
</html>
