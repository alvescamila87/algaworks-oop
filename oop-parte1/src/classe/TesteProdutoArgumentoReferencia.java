package classe;

public class TesteProdutoArgumentoReferencia {
	
	public static void main(String[] args) {
		
		// argumento por valor (local): tipo primitivo
		/*
		double preco = 140;
		
		
		Produto p = new Produto();
		p.definirPreco(preco);
		
		System.out.println("Preço: " + preco);
		*/
		
		
		// argumento por referência (objeto)
		Preco preco2 = new Preco();
		preco2.valorCustos = 140;
		
		Produto p2 = new Produto();
		p2.definirPreco(preco2, 20, 15);
		
		System.out.println("Valor de custos: " + preco2.valorCustos);
		System.out.println("Valor impostos: " + preco2.valorImpostos);
		System.out.println("Valor lucro: " + preco2.valorLucro);
		System.out.println("Preço venda: " + preco2.precoVenda);
		
		// exemplo 2 - argumento por referência
		Preco preco3 = new Preco();
		preco3.valorCustos = 130;
		
		Produto produto3 = new Produto();
		produto3.ajustarPreco(preco3);
		
		System.out.println("Preço 3 - ex Referência de objeto: " + preco3.valorCustos);
	}

}
