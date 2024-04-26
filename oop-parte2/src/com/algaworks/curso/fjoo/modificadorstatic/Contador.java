package com.algaworks.curso.fjoo.modificadorstatic;

public class Contador {
	
	public static int count = 0;
	
	// constante
	public static final double PI = 3.14; // não altera mais valor, por isso static final e letras maiúsculas na variável
	
	public void incrementar() {
		count++;
	}

	// método estático	
	public static void imprimirContador() {
		System.out.println("O valor do contador agora é: " + Contador.count);
	}
}
