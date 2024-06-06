package avancados.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TesteProdutoComparatorNome {
	
	public static void main(String[] args) {
		
		/*
		 * Exercício: Crie uma classe Produto com os atributos nome e preco. 
		 * Implemente dois comparadores: um para comparar os produtos pelo nome 
		 * (alfabeticamente) e outro para comparar os produtos pelo preço (em ordem crescente). 
		 * Crie uma lista de produtos, ordene-a utilizando cada um dos comparadores e imprima a 
		 * lista ordenada para cada caso.
		 */
		
		
		Produto p1 = new Produto("Pneu", 220.90);
		Produto p2 = new Produto("Antena", 350.90);
		Produto p3 = new Produto("Lanterna", 179.90);
		
		List<Produto> listaProdutos = Arrays.asList(p1, p2, p3);
		
		ProdutoOrdenandoPorNome ordenarNome = new ProdutoOrdenandoPorNome();
		Collections.sort(listaProdutos, ordenarNome);
		
		// Comparar por nome
		for(Produto produto : listaProdutos) {
			System.out.println(produto);
		}
		
	}

}
