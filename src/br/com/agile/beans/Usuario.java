package br.com.agile.beans;

import java.util.UUID;

public class Usuario {

	private String id;
	private String nome;
	private String email;
	private String senha;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario(String nome, String email, String senha) {
		super();
		this.id = UUID.randomUUID().toString();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public Usuario() {
		super();
		this.id = UUID.randomUUID().toString();
	}


	public String toString() {
		return "Usuario [nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
	}
	
	
}
