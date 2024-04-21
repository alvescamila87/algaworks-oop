package practices;

public class Loja {
	
	Carro[] carros;
	
	void listarInformacoesLoja() {
		System.out.println("\nInformações na Loja");
		System.out.println("-------------------------------");
		
		double somaPrecoGeral = 0.0;
		
		for(int x = 0; x < carros.length; x++) {
			carros[x].listarVeiculo();
			
			somaPrecoGeral += carros[x].preco;
		}
		
		System.out.println("\nMédia de preço dos veículos na loja: R$" + (somaPrecoGeral / carros.length));
	}

}
