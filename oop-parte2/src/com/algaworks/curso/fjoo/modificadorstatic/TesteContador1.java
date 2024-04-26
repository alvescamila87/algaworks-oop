package com.algaworks.curso.fjoo.modificadorstatic;

public class TesteContador1 {
	
	public static void main(String[] args) {
		
		// Contador do objeto
		Contador c = new Contador();
		c.count++;
		
		// Contador da classe
		
		// Contador.count = 5;
		
		Contador.count++; // acessando | modificando valor de count
		
		int valorDoCount = Contador.count; // lendo valor de count
		
		System.out.println("Valor: " + valorDoCount);
	}

}
