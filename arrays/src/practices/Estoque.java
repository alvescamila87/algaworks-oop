package practices;

public class Estoque {
	
	Produto[] produtos;
	
	void listarProdutos() {
		System.out.println("\nProdutos em estoque");
		System.out.println("--------------------------");
		
		int somaQtdProdutos = 0;
		
		for(int i = 0; i < produtos.length; i++) {
			produtos[i].descrever();
			
			somaQtdProdutos += produtos[i].quantidade; 
		}
		
		System.out.println("\nTotal em estoque: " + somaQtdProdutos);
	}

}
