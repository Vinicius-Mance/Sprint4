package br.com.agile.teste;

import br.com.agile.beans.Usuario;
import br.com.agile.dao.AgileDAO;

public class TesteDAO {
	
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("vinicius","vinimance@gmail.com","1234");
		
		try {
			
			//AgileDAO.cadastrar(usuario);	
			//System.out.println("Cadastro realizado");
			
			//AgileDAO.apagar(usuario);
			//System.out.println("Usuario apagado");
			
			//Usuario vinicius = AgileDAO.selecionarUsuario("vinimance@gmail.com");
			//System.out.print(vinicius.toString());
			
			//AgileDAO.alterar(usuario);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}
