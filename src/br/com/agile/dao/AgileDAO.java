package br.com.agile.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.agile.beans.Usuario;
import br.com.agile.conexao.Conexao;

public class AgileDAO {

		
		public static boolean cadastrar(Usuario usuario) {
			
			boolean resultado = false;
			
			try {
				
				Connection c = new Conexao().getConnection();
				String sql = "INSERT INTO usuarios(nome, email, senha) value (?,?,?)";
				
				PreparedStatement stmt = c.prepareStatement(sql);
					
				stmt.setString(1, usuario.getNome());
				stmt.setString(2, usuario.getEmail());
				stmt.setString(3, usuario.getSenha());
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
		
		public static boolean apagar(Usuario usuario, String nome, String email, String senha) {
			
			boolean resultado = false;
			
			try {
				
				Connection c = new Conexao().getConnection();
				//update usuarios set nome = "josé", email = "teste@teste.com", senha = "4321" where email="vinimance@gmail.com" ;
				String sql = "UPDATE USUARIOS SET nome = ?, senha = ? WHERE;
				
				PreparedStatement stmt = c.prepareStatement(sql);
					
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
	
		public static boolean alterar(String email) {
			
			boolean resultado = false;
			
			try {
				
				Connection c = new Conexao().getConnection();
				
				String sql = "SELECT nome, email, senha FROM usuarios WHERE email='"+email+"'";
				
				PreparedStatement stmt = c.prepareStatement(sql);
					
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
		
		public static Usuario selecionarUsuario(String email) {
			
			Usuario usuario = new Usuario();
			
			try {
				
				Connection c = new Conexao().getConnection();
				
				String sql = "SELECT nome, email, senha FROM usuarios WHERE email='"+email+"'";
				
				PreparedStatement stmt = c.prepareStatement(sql);
				ResultSet resultado = stmt.executeQuery();
				
				while (resultado.next()) {
					usuario.setNome(resultado.getString("nome"));
					usuario.setEmail(resultado.getString("email"));
					usuario.setSenha(resultado.getString("senha"));
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
