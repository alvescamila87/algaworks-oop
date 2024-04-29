package com.algaworks.curso.fjoo.sobreposicao;

public class Veiculo {
	
	protected String marca;
	protected String modelo;
	
	public void exibirInfo() {
		System.out.println("\nINFORMAÇÕES DO VEÍCULO");
		System.out.println("-----------------------------------");
		System.out.println("\nMarca: " + marca + "\nModelo: " + modelo);
	}

}
