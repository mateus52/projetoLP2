package model.entity;

public class Fornecedor {
    
	int codFornecedor;
	String nomeFornecedor;
	
	public Fornecedor(int codFornecedor, String nomeFornecedor) {
		super();
		this.codFornecedor = codFornecedor;
		this.nomeFornecedor = nomeFornecedor;
	}

	public int getCodFornecedor() {
		return codFornecedor;
	}

	public void setCodFornecedor(int codFornecedor) {
		this.codFornecedor = codFornecedor;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}
	
	
	
	
    
}
