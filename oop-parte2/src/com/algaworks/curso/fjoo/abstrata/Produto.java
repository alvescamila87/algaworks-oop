package com.algaworks.curso.fjoo.abstrata;

public abstract class Produto {
	
	String descricao;
	
	//método abstrato utilizado na herança
	public abstract void imprimirDescricao();
	
	public String getDescricao() {
		return descricao;
	}

}
