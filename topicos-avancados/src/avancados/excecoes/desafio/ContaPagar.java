package avancados.excecoes.desafio;

public class ContaPagar extends Conta {
	
	private Fornecedor fornecedor;
	
	public ContaPagar() {}
	
	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		super(descricao, valor, dataVencimento);
		this.fornecedor = fornecedor;		
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public void pagar() throws OperacaoContaException {
		if(this.situacaoConta == SituacaoConta.PAGA || this.situacaoConta == SituacaoConta.CANCELADA) {
			//System.out.println("Não é possível realizar pagamento de conta PAGA ou CANCELADA. Esta conta está: " + getSitucaoConta());
			throw new OperacaoContaException("Não é possível realizar pagamento de conta PAGA ou CANCELADA.");
		} else {
			this.situacaoConta = SituacaoConta.PAGA;
			
			System.out.println();
			System.out.println("INFORMAÇÕES DE PAGAMENTO");
			System.out.println("--------------------------------------");
			System.out.println("Fornecedor: " + getFornecedor().getNome());
			System.out.println("Descrição: " + getDescricao());
			System.out.printf("Valor: R$%.2f \n", getValor());
			System.out.println("Data vencimento: " + getDataVencimento());			
		}
	}

	@Override
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("CONTA A PAGAR");
		System.out.println("--------------------------------------");
		System.out.println("Fornecedor: " + getFornecedor().getNome());
		System.out.println("Situação da conta: " + getSitucaoConta());
		System.out.println("Data vencimento: " + getDataVencimento());
		System.out.printf("Valor: R$%.2f \n", getValor());		
		System.out.println("Descrição: " + getDescricao());	
	}
}
