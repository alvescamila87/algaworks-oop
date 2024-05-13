package com.algaworks.curso.fjoo.interfaces.caixa;

import com.algaworks.curso.fjoo.interfaces.impressao.Imprimivel;
import com.algaworks.curso.fjoo.interfaces.pagamento.Autorizavel;

// Seguindo contrato da interface autorizável
public class Compra implements Autorizavel, Imprimivel {
	
	private double valorTotal;
	private String produto;
	private String nomeCliente;


	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	// implemetando os métodos da interface autorizável
	@Override 
	public double getValorTotal() {
		return this.valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	// implemetando os métodos da interface imprimível
	@Override
	public String getCabecalhoPagina() {
		return this.getProduto() + " = " + this.getValorTotal();
	}

	// implemetando os métodos da interface imprimível
	@Override
	public String getCorpoPagina() {
		return this.getNomeCliente();
	}

}
