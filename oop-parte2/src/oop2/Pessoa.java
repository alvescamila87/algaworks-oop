package oop2;

public class Pessoa {
	
	String nome;
	int idade;
	
	Pessoa(String nome){
		this.nome = nome;
		// se tivesse mais código com a inicialização pesada...
	}
	
	Pessoa(String nome, int idade){
		//this.nome = nome;
		this(nome);
		this.idade = idade;
	}

}
