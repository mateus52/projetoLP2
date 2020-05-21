package entity;

import java.util.Date;

abstract class Pessoa {
	
	private String nome;
	private Date dataNasc;
	
	public Pessoa(String nome, Date dataNasc) {
		
		this.nome = nome;
		this.dataNasc = dataNasc;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	
}