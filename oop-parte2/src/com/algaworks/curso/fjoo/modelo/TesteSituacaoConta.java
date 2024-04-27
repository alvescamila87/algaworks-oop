package com.algaworks.curso.fjoo.modelo;

public class TesteSituacaoConta {
	
	public static void main(String[] args) {
		
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Israel Casa & Cia Negócios Imobiliários");
		
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do Zebedeu");
		
		ContaPagar conta1 = new ContaPagar();
		conta1.setDescricao("Aluguel matriz");
		conta1.setValor(1230d);
		conta1.setDataVencimento("27/04/2024");
		conta1.setFornecedor(imobiliaria);
		
		ContaPagar conta2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/04/2024");
		
		ContaPagar conta3 = new ContaPagar(mercado, "Aluguel da filial", 700d, "11/04/2024");
		
		// pagamento de conta pendente (ok, deve funcionar)
		conta1.pagar();
		
		// tentativa de pagar uma conta cancelada (não deve aceitar pagamento)
		conta2.cancelar();
		conta2.pagar();
		
		// tentativa de pagar uma conta duas vezes (não deve aceitar a segunda vez)
		conta3.pagar();
		conta3.pagar();
		conta3.cancelar();

		
	}

}
