package desafiopolimorfismo;

import java.util.Iterator;

public class RelatorioPessoas {
	
	public void listarPessoas(Pessoa[] pessoas) {
		
		System.out.println("LISTAGEM DE PESSOAS");
		System.out.println("------------------------------------");
		
		for (Pessoa pessoa : pessoas) {
			pessoa.exibirDetalhes();
		}
	}

}
