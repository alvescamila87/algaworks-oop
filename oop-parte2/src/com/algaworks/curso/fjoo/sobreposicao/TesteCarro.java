package com.algaworks.curso.fjoo.sobreposicao;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Carro carro01 = new Carro();
		carro01.marca = "VW";
		carro01.modelo = "Golf";
		carro01.quantidadePortas = 4;
		
		carro01.exibirInfo();
		
		Carro carro02 = new Carro();
		carro02.marca = "BMW";
		carro02.modelo = "X4";
		carro02.quantidadePortas = 4;
		
		carro02.exibirInfo();
				
	}

}
