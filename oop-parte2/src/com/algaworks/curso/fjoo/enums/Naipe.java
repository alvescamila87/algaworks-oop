package com.algaworks.curso.fjoo.enums;

public enum Naipe {
	
	OURO("Vermelho"),
	COPAS("Vermelho"),
	ESPADA("Preto"),
	PAUS("Preto");
	
	Naipe(String cor){
		this.cor = cor;
	}
	
	private String cor;
	
	public String getCor() {
		return cor;
	}

}
