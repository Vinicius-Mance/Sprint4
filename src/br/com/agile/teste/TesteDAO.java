package br.com.agile.teste;

import br.com.agile.beans.Usuario;
import br.com.agile.dao.AgileDAO;

public class TesteDAO {
	
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("vinicius","vinimance@gmail.com","1234","12312312312","12312312312");
		
		try {
			
			//AgileDAO.cadastrarUsuario(usuario);	
			//System.out.println("Cadastro realizado");
			
			//AgileDAO.deletarUsuario(1);
			//System.out.println("Usuario apagado");
			
			//Usuario vinicius = AgileDAO.selecionarUsuario(2);
			//System.out.print(vinicius.toString());
			
			//AgileDAO.alterarUsuario(2,"teste","teste","teste","teste","teste");
			//System.out.print("usuario alterado");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}
