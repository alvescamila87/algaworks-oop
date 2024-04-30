package desafio01;

public class TesteDesafio01 {
	
	public static void main(String[] args) {

		// instanciando fornecedores
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");		
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		
		// instanciando clientes
		Cliente atacadista = new Cliente();
		atacadista.setNome("Triângulo Quadrado Atacadista");		
		Cliente telecom = new Cliente();
		telecom.setNome("FoneNet Telecomunicações");
		
		// instanciando contas a pagar
		ContaPagar contaPagar1 = new ContaPagar();
		contaPagar1.setDescricao("Aluguel da matriz");
		contaPagar1.setValor(1230d);
		contaPagar1.setDataVencimento("10/05/2024");
		contaPagar1.setFornecedor(imobiliaria);
		
		ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2024"); 
		
		// instanciando contas a receber
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
		contaReceber1.setValor(89500d);
		contaReceber1.setDataVencimento("23/05/2024");
		contaReceber1.setCliente(telecom);
		
		ContaReceber contaReceber2 = new ContaReceber(telecom,"Manutenção em sistema de conta online", 53200d, "13/05/2024");
		
		// pagamento e cancelamento de contas a pagar
		contaPagar1.pagar();
		System.out.println(contaPagar1.getValor());
		contaPagar2.cancelar();
		System.out.println(contaPagar2.getValor());
		
		
		// recebimento e cancelamento de contas a receber
		contaReceber1.receber();
		System.out.println(contaReceber1.getValor());
		//contaReceber2.cancelar();
		System.out.println(contaReceber2.getValor());
		
	}

}
