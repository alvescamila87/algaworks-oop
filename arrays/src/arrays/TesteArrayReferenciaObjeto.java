package arrays;

public class TesteArrayReferenciaObjeto {
	
	public static void main(String[] args) {
		
		// Array de objeto
					
		Carro[] carros = new Carro[4]; // array de objeto do tipo Carro
		
		carros[0] = new Carro();
		carros[0].anoDeFabricacao = 2024;
		
		System.out.println("Carro \"0\" ano de fabricação: " + carros[0].anoDeFabricacao);
		
	}

}
