package tryresources;

import java.util.Scanner;

public class TryEMultiCast {
	
	public static void main(String[] args) {
		
		// Try with resources (closeable)
		try(Scanner entrada = new Scanner(System.in)){
		
			System.out.println("Informe o seu nome: ");
			String nome = entrada.nextLine();
			
			System.out.println("Informe a sua idade: ");
			String idade = entrada.nextLine();
			
			try {
				SalvarAluno.salvar(nome, idade);		
			// Multi catch com pipe | 
			} catch (NegocioException | NumberFormatException e) {
				System.err.println("Impossível completar operação. Motivo: " + e.getMessage());
			}
			
			
		}
	}

}
