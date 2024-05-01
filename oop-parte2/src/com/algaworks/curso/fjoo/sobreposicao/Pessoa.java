package com.algaworks.curso.fjoo.sobreposicao;

public class Pessoa {
	
	String nome;
	int idade;
	String cidade;
	
	public void imprirmirInfos() {
		System.out.println("INFORMAÇÕES DA PESSOA");
		System.out.println("-------------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Cidade: " + cidade);
	}

}
