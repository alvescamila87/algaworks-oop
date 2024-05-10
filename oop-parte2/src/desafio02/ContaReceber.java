package desafio02;

public class ContaReceber extends Conta{

	private Cliente cliente;

	public ContaReceber() {
	}

	public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {
		super(descricao, valor, dataVencimento);
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void receber() {
		if (getSituacaoConta() == SituacaoConta.PAGA) {
			System.out.println("Esta conta já foi paga. Situação da conta: " + getSituacaoConta());
		} else {
			situacaoConta = SituacaoConta.PAGA;

			System.out.println();
			System.out.println("INFORMAÇÕES DE RECEBIMENTO");
			System.out.println("---------------------------------");
			System.out.println("Descrição: " + getDescricao());
			System.out.printf("Valor: R$%.2f \n", getValor());
			System.out.println("Data Vencimento: " + getDataVencimento());
			System.out.println("Cliente: " + getCliente().getNome());
		}
	}

	@Override
	public void cancelar() {
		if (getValor() > 50_000d) {
			System.out.printf(
					"Não é permitido cancelamento de conta a receber ACIMA de R$ 50.000,00. Valor da conta: R$%.2f \n",
					getValor());
		} else {
			super.cancelar();
			// já possui mensagem de "cancelamento com sucesso" dentro do método super
		}
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("CONTA A RECEBER");
		System.out.println("------------------------");
		System.out.println("Cliente: " + getCliente().getNome());
		System.out.println("Situação: " + getSituacaoConta());
		System.out.println("Valor: R$" + getValor());
		System.out.println("Data vencimento: " + getDataVencimento());
		System.out.println("Descrição: " + getDescricao());
		System.out.println("------------------------");
		
	}
}
