import java.util.Scanner;

public class EntradaDadosIMC {
	public static void main(String[] args){
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o peso (kg): ");
		int peso = entrada.nextInt();
		
		System.out.print("Digite a altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("IMC de " + nome + ": " + imc);	
		
		if(imc < 18.5) {
			System.out.println("Abaixo do peso ideal");
		} else if (imc < 25) {
			System.out.println("Peso ideal"); 
		} else if(imc < 30) {
			System.out.println("Sobrepeso I"); 
		} else if (imc <40) {
			System.out.println("Obesidade - Grau I ou II"); 
		} else {
			System.out.println("Obesidade - Grau III"); 
			System.out.println("Muito cuidado com seu peso."); 
		}
		
	
	}
}