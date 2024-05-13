package com.algaworks.curso.fjoo.interfaces.teste;

import com.algaworks.curso.fjoo.interfaces.caixa.Checkout;
import com.algaworks.curso.fjoo.interfaces.caixa.Compra;
import com.algaworks.curso.fjoo.interfaces.impressao.impressoras.ImpressoraHP;
import com.algaworks.curso.fjoo.interfaces.pagamento.Cartao;
import com.algaworks.curso.fjoo.interfaces.pagamento.operadoras.OperadoraRedecard;

public class TesteCheckoutHP {
	
	public static void main(String[] args) {
		
		OperadoraRedecard operadora = new OperadoraRedecard();
		ImpressoraHP impressora = new ImpressoraHP();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Zebedeu");
		cartao.setNumeroCartao("456");
		
		Compra compra = new Compra();
		compra.setNomeCliente("Zebedeu Abraão");
		compra.setProduto("Creme dental");
		compra.setValorTotal(10.9);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
		
	}

}
