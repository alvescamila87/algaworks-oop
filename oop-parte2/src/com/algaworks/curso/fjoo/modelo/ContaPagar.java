package com.algaworks.curso.fjoo.modelo;

public class ContaPagar {
		
		String descricao;
		Double valor;
		String dataVencimento;
		Fornecedor fornecedor;
		SituacaoConta situacaoConta;
		
		ContaPagar(){
			this.situacaoConta = situacaoConta.PENDENTE;		
		}
		
		ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento){
			this();
			this.fornecedor = fornecedor;
			this.descricao = descricao;
			this.valor = valor;
			this.dataVencimento = dataVencimento;		
		}
		
		void pagar() {		
			if(this.situacaoConta == SituacaoConta.PAGA || this.situacaoConta == SituacaoConta.CANCELADA) {
				
				System.out.println("Não é possível realizar pagamento de conta PAGA ou CANCELADA. Essa conta está: " + getSituacaoConta());	
				
			}  else {
				
				this.situacaoConta = SituacaoConta.PAGA;
				
				System.out.println("INFORMAÇÕES DE PAGAMENTO");
				System.out.println("---------------------------------");
				System.out.println("Descrição: " + descricao);
				System.out.println("Valor: " + valor);
				System.out.println("Descrição: " + dataVencimento);
				System.out.println("Fornecedor: " + fornecedor.nome);			
			}
		}
		
		void cancelar() {
			this.situacaoConta = SituacaoConta.CANCELADA;
			System.out.println("Não é possível realizar cancelamento de conta que já foi CANCELADA ou PAGA. Essa conta está: " + getSituacaoConta());
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

		// get de enum
		public SituacaoConta getSituacaoConta() {
			return situacaoConta;
		}

}

