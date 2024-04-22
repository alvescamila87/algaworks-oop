package oop2;

public class Carro {
	
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;
	boolean biCombustivel;
	
	Proprietario dono; // relacionamento tem um
	
	void alterarModelo(String modelo) {
		if(modelo != null) {
			this.modelo = modelo;
		}
	}
	
	void ligar() {
		if(modelo == null) {
			return;
		}
		
		System.out.println("Ligando o carro: " + modelo);
	}
}