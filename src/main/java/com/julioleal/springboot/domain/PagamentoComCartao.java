package com.julioleal.springboot.domain;

import javax.persistence.Entity;

import com.julioleal.springboot.domain.enums.EstadoPagamento;


@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;

	private int numeroDeParcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(int id, EstadoPagamento estado, Pedido pedido, int numeroDeParcelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public int getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(int numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
	
}
