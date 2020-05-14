package entity;

import java.util.Date;
import java.util.List;

import enums.Secao;

public class Estoque {
	
	private int quantidade;
	private Date validade;
	private String lote;
	private Secao secao;
	
	private List<Produto> listaprodutos;

	public Estoque(int quantidade, Date validade, String lote, Secao secao) {
		this.quantidade = quantidade;
		this.validade = validade;
		this.lote = lote;
		this.secao = secao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public Secao getSecao() {
		return secao;
	}

	public void setSecao(Secao secao) {
		this.secao = secao;
	}

	public List<Produto> getListaprodutos() {
		return listaprodutos;
	}

	public void setListaprodutos(List<Produto> listaprodutos) {
		this.listaprodutos = listaprodutos;
	}
	
	
	
	
	

}
