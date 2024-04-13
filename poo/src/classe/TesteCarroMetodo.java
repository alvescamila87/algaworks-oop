package classe;

public class TesteCarroMetodo {
	public static void main(String[] args) {
		
		Carro carro01 = new Carro();
		//carro01.modelo = "Polo";
		
		Carro carro02 = new Carro();
		carro02.modelo = "Golf";
		
		carro01.ligar();
		carro02.ligar();
	}

}
