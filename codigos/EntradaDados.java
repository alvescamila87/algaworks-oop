import java.util.Scanner;

public class EntradaDados {
	public static void main(String[] args){
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o peso (kg): ");
		int peso = entrada.nextInt();
		
		System.out.print("Digite a altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.print("IMC de " + nome + ": " + imc);	
	
	}
}