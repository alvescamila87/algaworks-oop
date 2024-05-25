package avancados.excecoes.desafio;

public abstract class Conta {
	
	private String descricao;
	private Double valor;
	private String dataVencimento;
	protected SituacaoConta situacaoConta;
	
	protected Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	
	public Conta(String descricao, Double valor, String dataVencimento) {
		this();
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;		
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public SituacaoConta getSitucaoConta() {
		return situacaoConta;
	}

	public void cancelar() throws OperacaoContaException {
		if(this.situacaoConta == SituacaoConta.PENDENTE) {
			this.situacaoConta = situacaoConta.CANCELADA;
			System.out.println("Conta cancelada com sucesso!");
		} else {
			System.out.println("Não é possível realizar o cancelamento de conta que já foi CANCELADA ou PAGA. Essa conta está: " + getSitucaoConta());
		}
	}
	
	public abstract void exibirDetalhes();

}
