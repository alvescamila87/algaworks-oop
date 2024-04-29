package com.algaworks.curso.fjoo.sobreposicao;

public class Carro extends Veiculo {
	
	protected int quantidadePortas;
	
	@Override
	public void exibirInfo() {		
		super.exibirInfo();
		System.out.println("Quantidade de portas: " + quantidadePortas);
	}

}
