package practices;

import java.util.Scanner;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//quantidade de veículos na loja
		System.out.println("Quantidade de veículos na loja: ");
		int quantidadeVeiculos = entrada.nextInt();
		
		entrada.nextLine();
		
		// instanciar objeto de Loja
		Loja loja = new Loja();
		
		// instanciar array de veículos com quantidade de veículos
		loja.carros = new Carro[quantidadeVeiculos];
		
		// iterar array com informações de usuário
		for(int i = 0; i < loja.carros.length; i++) {
			loja.carros[i] = new Carro();			
			
			System.out.println("\nCarros " + i);
			System.out.println("-------------------------");
			
			System.out.println("Marca: ");
			loja.carros[i].marca = entrada.nextLine();
			
			System.out.println("Modelo: ");
			loja.carros[i].modelo = entrada.nextLine();
			
			System.out.println("Preço R$: ");
			loja.carros[i].preco = entrada.nextDouble();
			entrada.nextLine();
		}
		
		loja.listarInformacoesLoja();
		
	}

}
