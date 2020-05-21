package entity;

import enums.TipoEndereco;

public class Endereco {
	private String endereco;
	private String bairro;
	private String cidade;
	private TipoEndereco tipoEndereco;
	private Cliente cliente;
	
	public Endereco(String endereco, String bairro, String cidade, TipoEndereco tipoEndereco, Cliente cliente) {
		
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.tipoEndereco = tipoEndereco;
		this.cliente = cliente;
	}

	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
}
