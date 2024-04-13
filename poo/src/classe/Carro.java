package classe;

public class Carro {
	
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;
	boolean biCombustivel;
	
	Proprietario dono; // relacionamento tem um
	
	void ligar() {
		if(modelo == null) {
			return;
		}
		
		System.out.println("Ligando o carro: " + modelo);
	}
}
