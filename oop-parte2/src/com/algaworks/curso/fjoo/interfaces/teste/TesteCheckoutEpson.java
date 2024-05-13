package com.algaworks.curso.fjoo.interfaces.teste;

import com.algaworks.curso.fjoo.interfaces.caixa.Checkout;
import com.algaworks.curso.fjoo.interfaces.caixa.Compra;
import com.algaworks.curso.fjoo.interfaces.impressao.Impressora;
import com.algaworks.curso.fjoo.interfaces.impressao.impressoras.ImpressoraEpson;
import com.algaworks.curso.fjoo.interfaces.pagamento.Cartao;
import com.algaworks.curso.fjoo.interfaces.pagamento.Operadora;
import com.algaworks.curso.fjoo.interfaces.pagamento.operadoras.OperadoraCielo;

public class TesteCheckoutEpson {
	
	public static void main(String[] args) {
		
		// Interface não possui "new Operadora()", pois não tem implementação. Não existe.
		Operadora operadora = new OperadoraCielo();
		Impressora impressora = new ImpressoraEpson();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("João M Couves");
		cartao.setNumeroCartao("123");
		
		Compra compra = new Compra();
		compra.setNomeCliente("João Mendonça Couves");
		compra.setProduto("Sabonete");
		compra.setValorTotal(2.5);
		
		// Pra fazer fechamento da compra
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
		
	}

}
