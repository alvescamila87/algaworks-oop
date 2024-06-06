package avancados.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProdutoComparatorPrecoNome {

	public static void main(String[] args) {

		Produto p1 = new Produto("Pneu", 220.90);
		Produto p2 = new Produto("Antena", 350.90);
		Produto p3 = new Produto("Lanterna", 179.90);

		List<Produto> listaProdutos = Arrays.asList(p1, p2, p3);

		// Ordenar por nome
		Collections.sort(listaProdutos, new ProdutoOrdenandoPorNome());
		System.out.println("Ordenar por nome");
		for (Produto produto : listaProdutos) {
			System.out.println(produto);
		}

		// Ordenar por preço
		Collections.sort(listaProdutos, new ProdutoOrdenandoPorPreco());
		System.out.println("Ordenar por preço");
		for (Produto produto : listaProdutos) {
			System.out.println(produto);
		}
	}

}
