package br.com.agile.conexao;

import java.sql.*;

public class Conexao {

	public Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl","rm87985","100901");
		
	}
	

}
