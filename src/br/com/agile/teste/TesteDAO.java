package br.com.agile.teste;

import br.com.agile.beans.Usuario;
import br.com.agile.dao.AgileDAO;
import java.sql.*;
import br.com.agile.conexao.Conexao;

public class TesteDAO {
	
	public static void main(String[] args) {
		
		//Usuario usuario = new Usuario("vinicius","vinimanci@gmail.com","1234","12312312313","42312312312");
		
		try {
			
			//AgileDAO.cadastrarUsuario(usuario);	
			//System.out.println("Cadastro realizado");
			
			//AgileDAO.deletarUsuario(1);
			//System.out.println("Usuario apagado");
			
			//Usuario vinicius = AgileDAO.selecionarUsuario(2);
			//System.out.print(vinicius.toString());
			
			//AgileDAO.alterarUsuario(2,"teste","teste","teste","teste","teste");
			//System.out.print("usuario alterado");
			Connection c = new Conexao().getConnection();
			
			String sql = "SELECT * FROM usuarios";
			
			PreparedStatement stmt = c.prepareStatement(sql);
			ResultSet resultado = stmt.executeQuery();
			
			while(resultado.next()) {
				System.out.println(resultado.getInt("id"));
				System.out.println(resultado.getString("nome"));
				System.out.println(resultado.getString("email"));
				System.out.println(resultado.getString("senha"));
				System.out.println(resultado.getString("cpf"));
				System.out.println(resultado.getString("numero"));
			}
					
			c.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}
