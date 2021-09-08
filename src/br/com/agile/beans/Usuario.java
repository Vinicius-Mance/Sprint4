package br.com.agile.beans;

import java.util.UUID;

public class Usuario {

	private String id;
	private String nome;
	private String email;
	private String senha;
	private String CPF;
	private int numero;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Usuario(String id, String nome, String email, String senha, String CPF, int numero) {
		if(this.id == null) {
			this.id = UUID.randomUUID().toString();
		}
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.CPF = CPF;
		this.numero = numero;
	}

	public Usuario() {
		if(this.id == null) {
			this.id = UUID.randomUUID().toString();
		}
	}

	@Override
	public String toString() {
		return "Usuario{" +
				"id='" + id + '\'' +
				", nome='" + nome + '\'' +
				", email='" + email + '\'' +
				", senha='" + senha + '\'' +
				", CPF='" + CPF + '\'' +
				", numero=" + numero +
				'}';
	}
}
