package oop2;

public class TesteEncapsulamento {
	
	public static void main(String[] args) {
		
		ArCondicionado ar = new ArCondicionado();
		
		System.out.println("Temperatura: " + ar.obterTemperatura() + "º C.");
		
		ar.alterarTemperatura(18);
		ar.alterarTemperatura(10);
		
		System.out.println("Temperatura: " + ar.obterTemperatura() + "º C.");
		
	}

}
