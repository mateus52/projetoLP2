package entity;

public class Endereco {
	
	private String endereco;
	private String bairro;
	private String cidade;
	private TipoEndereco tipo;
	
	
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
	
	public TipoEndereco getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoEndereco tipo) {
		this.tipo = tipo;
	}
}
