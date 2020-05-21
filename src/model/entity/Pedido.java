package model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.StatusPedido;

public class Pedido {
	private int numero;
	private Date data;
	private StatusPedido statusPedido;
	private Double valorTotal ;
	private Pagamento pagto;
	
	private  List<ItemPedido> itensPedido = new ArrayList<>();

	public Pedido(int numero, Date data, Double valorTotal, Pagamento pagto ) {
		this.numero = numero;
		this.data = data;
		this.statusPedido = StatusPedido.REALIZADO;
		this.valorTotal = valorTotal;	
		this.pagto = pagto;
	}

	public StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}

	public Pagamento getPagto() {
		return pagto;
	}

	public void setPagto(Pagamento pagto) {
		this.pagto = pagto;
	}

	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(List<ItemPedido> itensPedido) {
		this.itensPedido = itensPedido;
	}

	public int getNumero() {
		return numero;
	}

	public Date getData() {
		return data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}
	
	

	
}
