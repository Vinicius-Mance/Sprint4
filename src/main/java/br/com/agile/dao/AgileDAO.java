package br.com.agile.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.agile.beans.Usuario;
import br.com.agile.conexao.Conexao;

public class AgileDAO {
		
		public static boolean cadastrarUsuario(Usuario usuario) {
			
			boolean resultado = false;
			
			try {
				
				Connection c = new Conexao().getConnection();
				
				String sql = "INSERT INTO usuarios(nome, email, senha, numero, cpf) value (?, ?, ?, ?, ? )";
				
				PreparedStatement stmt = c.prepareStatement(sql);
					
				stmt.setString(1, usuario.getNome());
				stmt.setString(2, usuario.getEmail());
				stmt.setString(3, usuario.getSenha());
				stmt.setString(4, usuario.getNumero());
				stmt.setString(5, usuario.getCPF());

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
		
		public static boolean alterarUsuario(String email, String senha) {
			
			boolean resultado = false;
			
			try {
				
				Connection c = new Conexao().getConnection();
				
				String sql = "UPDATE USUARIOS SET senha = ? WHERE email = ?";
				
				PreparedStatement stmt = c.prepareStatement(sql);

				stmt.setString(1, senha);
				stmt.setString(2, email);
				
				stmt.execute(); 
				
				stmt.close();
					
				c.close();

				resultado = true;
				
			} catch (SQLException e) {
				
				System.out.print("Erro: ");
				
				e.printStackTrace();
				
				resultado = false;
				
			}
			
			return resultado;
			
		}
		
		public static Usuario selecionarUsuario(String email) {

			Usuario usuario = new Usuario();
			
			try {
				
				Connection c = new Conexao().getConnection();
				
				String sql = "SELECT id, nome, email, senha, numero, cpf FROM usuarios WHERE email = ?";
				
				PreparedStatement stmt = c.prepareStatement(sql);
				stmt.setString(1, email);
				
				ResultSet resultado = stmt.executeQuery();
				
				while (resultado.next()) {
					usuario.setId(resultado.getInt("id"));
					usuario.setNome(resultado.getString("nome"));
					usuario.setEmail(resultado.getString("email"));
					usuario.setSenha(resultado.getString("senha"));
					usuario.setCPF(resultado.getString("cpf"));
					usuario.setNumero(resultado.getString("numero"));
				}
				
				stmt.execute(); 
				
				stmt.close();

				c.close();	
				
			} catch (SQLException e) {
				
				System.out.print("Erro: ");
				
				e.printStackTrace();
				
			}
			
			return usuario;
			
		}

	public static boolean deletarUsuario(String email) {

		boolean resultado = false;

		try {

			Connection c = new Conexao().getConnection();

			String sql = "DELETE FROM usuarios WHERE email = ?";

			PreparedStatement stmt = c.prepareStatement(sql);
			stmt.setString(1, email);
			
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
	
	public static Usuario verUsuarios(int id) {

		Usuario usuario = new Usuario();
		
		try {
			
			Connection c = new Conexao().getConnection();
			
			String sql = "SELECT id, nome, email, senha, numero, cpf FROM usuarios WHERE id = ?";
			
			PreparedStatement stmt = c.prepareStatement(sql);
			stmt.setInt(1,id);
			ResultSet resultado = stmt.executeQuery();
			
			while (resultado.next()) {
				usuario.setId(resultado.getInt("id"));
				usuario.setNome(resultado.getString("nome"));
				usuario.setEmail(resultado.getString("email"));
				usuario.setSenha(resultado.getString("senha"));
				usuario.setCPF(resultado.getString("cpf"));
				usuario.setNumero(resultado.getString("numero"));
			}
			
			stmt.execute(); 
			
			stmt.close();

			c.close();	
			
		} catch (SQLException e) {
			
			System.out.print("Erro: ");
			
			e.printStackTrace();
			
		}
		
		return usuario;
		
	}
}
