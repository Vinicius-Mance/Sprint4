package br.com.agile.conexao;

import java.sql.*;

public class Conexao {
	public Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			return DriverManager.getConnection("jdbc:mysql://localhost/fiap","root","");
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getException());
		}
	}
}
