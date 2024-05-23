package avancados;

import java.util.Scanner;

public class TesteDesafioMegaSena2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		MegaSena2 megaSena = new MegaSena2();
		
		System.out.println("Quantos jogos da Mega Sena deseja realizar? ");
		int quantidadeJogos = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Quantidade de jogos solicitados: " + quantidadeJogos);
		
		for(int i = 0; i < quantidadeJogos; i++) {
			System.out.println();
			System.out.println("\n---- JOGO Nº: " + (i + 1) + "----");
			megaSena.listarJogos();
		}
		
		
		entrada.close();
		
	}

}
