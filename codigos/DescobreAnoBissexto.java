import java.util.Scanner;

public class DescobreAnoBissexto{

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe um ano (AAAA): ");
		int ano = entrada.nextInt();
		
		if(ano % 400 == 0) { //Todos os múltiplos de 400 são bissextos
			System.out.println("O ano \"" + ano + "\" é um ano bissexto");
		} else if (ano % 4 == 0) {
			if (ano % 100 != 0) { // Múltiplo de 4 e não múltiplo de 100 são bissextos
				System.out.println("O ano \"" + ano + "\" é um ano bissexto");
			} else {
				System.out.println("O ano \"" + ano + "\" não é um ano bissexto");
			}
		} else {
			System.out.println("O ano \"" + ano + "\" não é um ano bissexto");
		}
	
	}

}