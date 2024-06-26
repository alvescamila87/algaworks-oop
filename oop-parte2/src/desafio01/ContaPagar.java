package desafio01;

public class ContaPagar extends Conta {
	
	private Fornecedor fornecedor;

	public ContaPagar(){}
	
	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento){
		super(descricao, valor, dataVencimento);
		this.fornecedor = fornecedor;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public void pagar() {		
		if(this.situacaoConta == SituacaoConta.PAGA || this.situacaoConta == SituacaoConta.CANCELADA) {
			
			System.out.println("Não é possível realizar pagamento de conta PAGA ou CANCELADA. Essa conta está: " + getSituacaoConta());	
			
		}  else {
			
			this.situacaoConta = SituacaoConta.PAGA;
			
			System.out.println();
			System.out.println("INFORMAÇÕES DE PAGAMENTO");
			System.out.println("---------------------------------");
			System.out.println("Descrição: " + getDescricao());
			System.out.printf("Valor: R$%.2f \n", getValor());
			System.out.println("Descrição: " + getDataVencimento());
			System.out.println("Fornecedor: " + getFornecedor().getNome());			
		}
	}
	


}
