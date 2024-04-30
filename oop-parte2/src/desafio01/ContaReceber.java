package desafio01;

public class ContaReceber extends Conta {
	
	private Cliente cliente;
	
	public ContaReceber(){}
	
	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento){
		super();
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void receber() {
		if(getSituacaoConta().equals(SituacaoConta.PAGA)){
			System.out.println("Esta conta já foi paga. Situação da conta: " + getSituacaoConta());	
		} else {
			this.situacaoConta = SituacaoConta.PAGA;
			
			System.out.println();
			System.out.println("INFORMAÇÕES DE RECEBIMENTO");
			System.out.println("---------------------------------");
			System.out.println("Descrição: " + getDescricao());
			System.out.println("Valor: " + getValor());
			System.out.println("Descrição: " + getDataVencimento());
			System.out.println("Cliente: " + getCliente().getNome());		
		}
	}
	
	@Override
	public void cancelar() {
		if(this.getValor() > 50_000d) {
			System.out.println("Não é permitido cancelamento de conta a receber ACIMA de R$ 50.000,00. Valor da conta: " + this.getValor());
		} else {
			super.cancelar();
			System.out.println("Conta a receber cancelada com sucesso!");
		}
	}

}
