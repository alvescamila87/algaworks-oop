package desafio01;

public class TesteDesafio01 {
	
	public static void main(String[] args) {

		// Instanciando fornecedores
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");		
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		
		// Instanciando clientes
		Cliente atacadista = new Cliente();
		atacadista.setNome("Triângulo Quadrado Atacadista");		
		Cliente telecom = new Cliente();
		telecom.setNome("FoneNet Telecomunicações");
		
		// Instanciando contas a pagar
		ContaPagar contaPagar1 = new ContaPagar();
		contaPagar1.setDescricao("Aluguel da matriz");
		contaPagar1.setValor(1230d);
		contaPagar1.setDataVencimento("10/05/2024");
		contaPagar1.setFornecedor(imobiliaria);
		
		ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2024"); 
		
		// Instanciando contas a receber
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
		contaReceber1.setValor(89500d);
		contaReceber1.setDataVencimento("23/05/2024");
		contaReceber1.setCliente(atacadista);
		
		ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online", 53200d, "13/05/2024");
		
		// Pagamento e cancelamento de contas a pagar
		contaPagar1.pagar();
		contaPagar2.cancelar();		
		
		// Recebimento e cancelamento de contas a receber
		contaReceber1.receber();
		contaReceber2.cancelar();
		
	}

}
