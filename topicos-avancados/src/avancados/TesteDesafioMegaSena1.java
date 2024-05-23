package avancados;

import java.util.Scanner;

public class TesteDesafioMegaSena1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		MegaSena1 megaSena = new MegaSena1();
		
		System.out.println("Informe a quantidade de jogos a serem feitos: ");
		int quantidadeJogos = entrada.nextInt();
		entrada.nextLine();
		
		megaSena.gerarJogos(quantidadeJogos);
		
		entrada.close();
		
	}

}
