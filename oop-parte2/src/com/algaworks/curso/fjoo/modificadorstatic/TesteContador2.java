package com.algaworks.curso.fjoo.modificadorstatic;

public class TesteContador2 {
	
	public static void main(String[] args) {
		
		Contador c = new Contador();
		c.incrementar();
		System.out.println("Contador método: " + Contador.count);
		
		Contador.count++;
		System.out.println("Contador objeto: " + c.count); //  NÃO RECOMENDADO
		System.out.println("Contador sempre pela classe: " + Contador.count); //  boa prática, sempre pela classe
		
		// método estático		
		Contador.imprimirContador();
		
		imprimirContador();
	}

	public static void imprimirContador() {
		System.out.println("O valor do contador agora é: " + Contador.count);
	}
}
