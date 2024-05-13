package com.algaworks.curso.fjoo.interfaces.caixa;

import com.algaworks.curso.fjoo.interfaces.impressao.Impressora;
import com.algaworks.curso.fjoo.interfaces.pagamento.Cartao;
import com.algaworks.curso.fjoo.interfaces.pagamento.Operadora;

public class Checkout {
	
	// Essa classe faz fechamento do pagamento da compra 
	// Ela precisa de operadora pra autorizar e impressora pra imprimir comprovante
	private Operadora operadora;
	private Impressora impressora;
	
	// Não está amarrado com interface e operadora fixo, mas sim com uma interface
	public Checkout(Operadora operadora, Impressora impressora) {
		this.operadora = operadora;
		this.impressora = impressora;
	}
	
	public void fecharCompra(Compra compra, Cartao cartao) {
		
		// API com interface que tem uma classe que implementa a interface (no caso Compra)
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		
		if(autorizado) {
			this.impressora.imprimir(compra);
		} else {
			System.out.println("Pagamento não autorizado!");			
		}
	}

	

}
