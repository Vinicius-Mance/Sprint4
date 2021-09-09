package br.com.agile.beans;

public class Usuario {

	private int id;
	private String nome;
	private String email;
	private String senha;
	private String CPF;
	private String numero;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Usuario(String nome, String email, String senha, String CPF, String numero) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.CPF = CPF;
		this.numero = numero;
	}

	public Usuario() {

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
