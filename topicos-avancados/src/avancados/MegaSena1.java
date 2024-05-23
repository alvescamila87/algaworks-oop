package avancados;

import java.util.ArrayList;
import java.util.Iterator;

public class MegaSena1 {
	
	final static int QUANTIDADE_NUMEROS = 6;	
	final static int LIMITE_MAXIMO_NUMEROS = 60;
	
	/**
	 * Sorteia um número randômico e converte para inteiro
	 * @param limite de números por mega sena realizada
	 * @return um número inteiro sorteado
	 */
	private int sortearNumero(int limite) {
		return (int) Math.round(Math.random() * LIMITE_MAXIMO_NUMEROS);
	}
	
	/**
	 * Gera uma sequência de 6 números sorteados randomicamente, 
	 * reutilizando o método 'sortear número' para preencher essa lista de números sorteados até atingir 6 números.
	 * @return
	 */
	private ArrayList<Integer> sortearSequencia() {
		
		ArrayList<Integer> sequencia = new ArrayList<>();
		
		for(int i = 0; i < QUANTIDADE_NUMEROS; i++) {
			
			int numeroSorteado = sortearNumero(LIMITE_MAXIMO_NUMEROS);
			
			if(sequencia.contains(numeroSorteado) || numeroSorteado == 0) {
				continue;
			}
			sequencia.add(numeroSorteado);
		}
		
		return sequencia;
	}
	
	/**
	 * Imprime a quantidade de jogos da lista de sequência, utilizando 
	 * o sorteio da sequência, colocando-os na ordem de geração.
	 * @param quantidadeJogos valor informado pelo usuário de quantas 'cartelas de jogos' deseja gerar
	 */
	public void gerarJogos(int quantidadeJogos) {
		System.out.println("\n*** ---------------- JOGOS SORTEADOS ----------------- ***");
		
		for(int i = 0; i < quantidadeJogos; i++) {
			
			System.out.println((i + 1) + "º Jogo: ");
			
			for(int n : sortearSequencia()) {
				System.out.print(n  + " - ");
			}
			System.out.println();
				
		}
		System.out.println("*********************************************************");
			
	}
}
	
	


