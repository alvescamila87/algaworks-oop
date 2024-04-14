package classe;

public class Produto {
	// argumento por valor (local): tipo primitivo
	/*
	void definirPreco(double precoCusto) {
		// adiciona 20% ao preço de custo
		precoCusto = precoCusto * 1.20; 
	}
	*/
	
	// argumento por referência (objeto)
	void definirPreco(Preco preco, double percentualImpostos, double margemLucro) {
		
		preco.valorImpostos = preco.valorCustos * (percentualImpostos / 100);
		
		preco.valorLucro = preco.valorCustos * (margemLucro / 100);
		
		preco.precoVenda = preco.valorCustos + preco.valorImpostos + preco.valorLucro;
	}
	
	// argumento por referencia (objeto) - exemplo 2
	void ajustarPreco(Preco preco) {
		preco.valorCustos *= 1.20;
	}

}
