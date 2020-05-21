package entity;

import enums.FormaPagto;

public class Pagamento {
	
	private int numero;
	private FormaPagto formaPagto;
	private double valor;
	private int qtdParcelas;
	private Pedido pedido;
	
	public Pagamento(int numero, FormaPagto formaPagto, double valor, int qtdParcelas, Pedido pedido) {
		this.numero = numero;
		this.formaPagto = formaPagto;
		this.valor = valor;
		this.qtdParcelas = qtdParcelas;
		this.pedido = pedido;
	}

	public FormaPagto getFormaPagto() {
		return formaPagto;
	}

	public void setFormaPagto(FormaPagto formaPagto) {
		this.formaPagto = formaPagto;
	}

	public int getQtdParcelas() {
		return qtdParcelas;
	}

	public void setQtdParcelas(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}

	public int getNumero() {
		return numero;
	}

	public double getValor() {
		return valor;
	}

	public Pedido getPedido() {
		return pedido;
	}
	
	
	
	
	
	
}
