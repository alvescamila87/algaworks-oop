package com.algaworks.curso.fjoo.abstrata;

public class TesteClasseAbstrata {
	
	public static void main(String[] args) {
		
		Produto p1 = new ProdutoPerecivel();
		p1.descricao = "Caixa de leite";
		
		// casting objeto	
		ProdutoPerecivel pp = (ProdutoPerecivel) p1;
		pp.dataValidade = "08/05/2024";
		
		pp.imprimirDescricao();
	}

}
