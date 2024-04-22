package oop2;

public class ExemploThisCarro {
	
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.modelo = "Polo";
		
		System.out.println("Modelo ANTES alteração: " + carro.modelo);
		
		carro.alterarModelo("Jetta");
		
		System.out.println("Modelo APÓS alteração: " + carro.modelo);
	}

}
