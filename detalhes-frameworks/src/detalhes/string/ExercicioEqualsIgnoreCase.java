package detalhes.string;

import java.util.Scanner;

public class ExercicioEqualsIgnoreCase {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a palavra 1: ");
		String palavra1 = entrada.nextLine();

		System.out.println("Informe a palavra 2: ");
		String palavra2 = entrada.nextLine();

		System.out.println();
		System.out.println("PALAVRA 1: " + palavra1);
		System.out.println("PALAVRA 2: " + palavra2);
		System.out.println();

		if (palavra1.equalsIgnoreCase(palavra2)) {
			System.out.println("EQUALS IGNORE CASE: As palavras digitadas são IGUAIS!");
		} else {
			System.out.println("EQUALS IGNORE CASE: As palavras digitadas São DIFERENTES.");
		}
	}

}
