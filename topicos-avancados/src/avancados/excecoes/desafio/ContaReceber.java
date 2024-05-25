package avancados.excecoes.desafio;

public class ContaReceber extends Conta {
	
	private Cliente cliente;

	public ContaReceber() {}
	
	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		super(descricao, valor, dataVencimento);
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void receber() throws OperacaoContaException {
		if(this.situacaoConta == situacaoConta.PAGA || this.situacaoConta == SituacaoConta.CANCELADA) {
			//System.out.println("Não é possível receber conta PAGA ou CANCELADA. Situação da conta: " + getSitucaoConta());
			throw new OperacaoContaException("Não é possível receber conta PAGA ou CANCELADA.");
		} else {
			situacaoConta= situacaoConta.PAGA;
			
			System.out.println();
			System.out.println("INFORMAÇÕES DE RECEBER");
			System.out.println("--------------------------------------");
			System.out.println("Cliente: " + getCliente().getNome());
			System.out.println("Descrição: " + getDescricao());
			System.out.printf("Valor: R$%.2f \n", getValor());
			System.out.println("Data vencimento: " + getDataVencimento());
		}
	}
	
	public void cancelar() throws OperacaoContaException {
		if(getValor() > 50_000) {
			//System.out.printf("Não é permitido cancelamento de conta a receber ACIMA de R$50.000,00. Valor da conta R$%.2f \n", getValor());
			throw new OperacaoContaException("Não é permitido cancelamento de conta a receber ACIMA de R$50.000,00.");
		} else {
			super.cancelar();
			// já possui mensagem de "cancelamento com sucesso" dentro do método super
		}
	}

	@Override
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("CONTA A RECEBER");
		System.out.println("--------------------------------------");
		System.out.println("Cliente: " + getCliente().getNome());
		System.out.println("Situação da conta: " + getSitucaoConta());		
		System.out.printf("Valor: R$%.2f \n", getValor());
		System.out.println("Data vencimento: " + getDataVencimento());
		System.out.println("Descrição: " + getDescricao());		
	}
}
