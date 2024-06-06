package avancados.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TesteProdutoComparator {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Pneu", 220.90);
		Produto p2 = new Produto("Antena", 350.90);
		Produto p3 = new Produto("Lanterna", 179.90);
		
		List<Produto> listaProdutos = Arrays.asList(p1, p2, p3);
		
		ProdutoOrdenandoPorPreco ordenarPreco = new ProdutoOrdenandoPorPreco();		
		Collections.sort(listaProdutos, ordenarPreco);
		
		// Comparar por preço
		for(Produto produto : listaProdutos) {
			System.out.println(produto);
		}		
		
	}

}
