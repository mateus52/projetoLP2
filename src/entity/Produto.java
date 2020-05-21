package entity;

public class Produto {

	private String codProduto; // pretendo criar codigo junto com o setor ex: produto de limpeza omo L234 L do setor + sequencia de numero
    private String nomeProduto;
    private String descricao; // aqui temos uma breve descrição do produto
    private String preco; // marca do produto 
    private Fornecedor fornecedor;
    private Estoque estoque;
    
	public Produto(String codProduto, String nomeProduto, String descricao, String preco, Fornecedor fornecedor, Estoque estoque) {
		this.codProduto = codProduto;
		this.nomeProduto = nomeProduto;
		this.descricao = descricao;
		this.preco = preco;
		this.fornecedor = fornecedor;
		this.estoque = estoque;
	}

	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	
	
	
    
    
    

    

}
