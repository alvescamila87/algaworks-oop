package oop2;

public class ContaPagar {
	
	String descricao;
	Double valor;
	String dataVencimento;
	Fornecedor fornecedor;
	
	ContaPagar(){
		
	}
	
	ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento){
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;		
	}
	
	void pagar() {
		System.out.println("INFORMAÇÕES DE PAGAMENTO");
		System.out.println("---------------------------------");
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("Descrição: " + dataVencimento);
		System.out.println("Fornecedor: " + fornecedor.nome);
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

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	

}
