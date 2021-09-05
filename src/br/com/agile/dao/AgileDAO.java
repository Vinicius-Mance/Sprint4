package br.com.agile.dao;

import br.com.agile.beans.Usuario;
import br.com.agile.conexao.Conexao;

import java.sql.*;

public class AgileDAO {

		
		public static boolean cadastrar(Usuario usuario) {
			
			boolean resultado = false;
			
			try {
				
				Connection c = new Conexao().getConnection();
				String sql = "INSERT INTO usuario(nome, curso, matricula, idade) value (?,?,?,?)";
				
				PreparedStatement stmt = c.prepareStatement(sql);
					
				stmt.setString(1, usuario.getNome());
				stmt.setString(2, usuario.getCurso());
				stmt.setString(3, usuario.getMatricula());
				stmt.setInt(4, usuario.getIdade());
				
				stmt.execute(); 
				stmt.close();
					
				c.close();	
				
				resultado = true;
				
			} catch (SQLException e) {
				System.out.print("Erro: ");
				e.printStackTrace();
			}
			return resultado;
		}
		
		public static boolean apagar(Usuario usuario) {
			
			boolean resultado = false;
			
			try {
		
				resultado = true;
				
			} catch (SQLException e) {
				System.out.print("Erro: ");
				e.printStackTrace();
			}
			return resultado;
		}
	
		public static boolean alterar(Usuario usuario) {
		
		boolean resultado = false;
		
		try {
	
			resultado = true;
			
		} catch (SQLException e) {
			System.out.print("Erro: ");
			e.printStackTrace();
		}
		return resultado;
	}
	
}
