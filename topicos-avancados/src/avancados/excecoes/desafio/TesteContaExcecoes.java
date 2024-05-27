package avancados.excecoes.desafio;

public class TesteContaExcecoes {
	
	public static void main(String[] args) {
		
		// Fornecedores
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliário");
		
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		
		// Clientes
		Cliente atacadista = new Cliente();
		atacadista.setNome("Triângulo Quadrado Atacadista");
		
		Cliente telecom = new Cliente();
		telecom.setNome("FoneNet Telecomunicações");
		
		// Instanciando contas a pagar
		ContaPagar contaPagar01 = new ContaPagar();
		contaPagar01.setDescricao("Aluguel da matriz");
		contaPagar01.setDataVencimento("25/05/2024");
		contaPagar01.setValor(1230d);
		contaPagar01.setFornecedor(imobiliaria);
		
		ContaPagar contaPagar02 = new ContaPagar(mercado, "Compras do mês", 390d, "13/05/2024");
		
		// Instanciando contas a receber
		ContaReceber contaReceber01 = new ContaReceber();
		contaReceber01.setDescricao("Desenvolvimento de projeto de logística em Java");
		contaReceber01.setDataVencimento("08/05/2024");
		contaReceber01.setValor(89500d);
		contaReceber01.setCliente(atacadista);
		
		ContaReceber contaReceber02 = new ContaReceber(telecom, "Manutenção em sistemas de conta online", 53200d, "16/05/2024");
		
		// Exibe listagem de todas as contas com detalhamento
		RelatorioContas relatorioContas = new RelatorioContas();
		
		Conta[] contas = new Conta[] {contaPagar01, contaPagar02, contaReceber01, contaReceber02};
		
		relatorioContas.exibirListagem(contas);
		
		// TESTE DE EXCEPTIONS
		System.out.println("--------------------------------------------------------");
		System.out.println("Teste exceptions");
		System.out.println("--------------------------------------------------------");
		
		try{
			contaPagar01.pagar(); // paga
			contaPagar02.cancelar(); // cancela
			
			contaReceber01.receber(); // recebe
			contaReceber02.cancelar(); // cancela
			contaReceber02.receber(); // gera exceção			
			
		} catch (OperacaoContaException e) {
			System.err.println("ERRO: Operação não autorizada. MOTIVO --> " + e.getMessage());
		} finally {
			System.out.println("Finally");
		}
		
		
	}
}
