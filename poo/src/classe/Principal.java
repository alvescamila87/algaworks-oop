package classe;

public class Principal {
	
	public static void main(String[] args) {
		
		Carro meuCarro; //declaramos a variável
		meuCarro = new Carro(); //instanciamos a variável com um objeto do tipo Carro
		
		Carro seuCarro = new Carro(); // objetos diferentes
		
		meuCarro.fabricante = "VW";
		meuCarro.modelo = "Polo";
		meuCarro.anoDeFabricacao = 2024;
		meuCarro.cor = "Preto";
		
		seuCarro.fabricante = "BWM";
		seuCarro.modelo = "X6";
		seuCarro.anoDeFabricacao = 2023;
		seuCarro.cor = "Branco";
		
		System.out.println("Meu carro");
		System.out.println("---------------------");
		System.out.println("Fabricante: " + meuCarro.fabricante);
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano de fabricação: " + meuCarro.anoDeFabricacao);
		System.out.println("Cor: " + meuCarro.cor);
		
			
		System.out.println("\nSeu carro");
		System.out.println("---------------------");
		System.out.println("Fabricante: " + seuCarro.fabricante);
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Ano de fabricação: " + seuCarro.anoDeFabricacao);
		System.out.println("Cor: " + seuCarro.cor);
		
		
		
		
		
	}

}
