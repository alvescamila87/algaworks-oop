package avancados.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPeloNome {
	
	public static void main(String[] args) {
		
		// Mantém a ordem de inserção
		List<Pessoa> pessoas = Arrays.asList(
				new Pessoa("João", 22), 
				new Pessoa("Zebedeu", 21), 
				new Pessoa("Princesa Isabel", 36),
				new Pessoa("Matheus", 15)
		);
		
		// Ordenar pelo nome da pessoa
		// Ordena natural pessoa
		Collections.sort(pessoas);
		
		// Ordenação por nome
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}

}
