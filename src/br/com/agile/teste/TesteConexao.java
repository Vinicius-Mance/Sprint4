package br.com.agile.teste;

import java.sql.*;
import br.com.agile.conexao.Conexao;

public class TesteConexao {

	public static void main(String[] args) throws Exception {
		
		try {
			
			Connection c = new Conexao().getConnection();
			
			System.out.println("Conexão Aberta");
			
		} catch (Exception e) {
			
			System.out.println("Erro de conexão");
			
		}
		
		
	}
}
