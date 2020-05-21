package entity;

import java.util.Date;

public class Cliente extends Pessoa{
	private String cpf;
	private String email;
	private String telefone;
	private String senha;
	
	public Cliente(String nome, Date dataNasc, String cpf, String email, String telefone, String senha) {
		super(nome, dataNasc);
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
	}

	public boolean validarCpf(String cpf ) {
		return true;
	}
	
	public boolean logarCliente(String email, String senha ) {
		return true;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
