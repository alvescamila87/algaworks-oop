import java.util.Scanner;

public class EntradaDadosIMCOperadoresLogicos{

	public static void main(String[] args){
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.println("Altura: ");
		double altura = entrada.nextDouble();		
		
		double imc = peso / (altura * altura);
		
		System.out.println("Sexo (Digite '1' para 'M' ou '2' para 'F':  ");		
		char sexo = entrada.nextShort() == 1 ? 'M' : 'F';
		/*
		if(sexo == 'M') {
			if(imc < 20.7) {
				System.out.println("IMC " + imc + " - Abaixo do peso");
			} else if(imc < 26.4) {
				System.out.println("IMC " + imc + " - No peso ideal");
			} else if(imc < 27.8) {
				System.out.println("IMC " + imc + " - Um pouco acima do peso");
			} else if(imc < 31.1) {
				System.out.println("IMC " + imc + " - Acima do peso ideal");
			} else {
				System.out.println("IMC " + imc + " - Obeso");
			}
		} else {
			if(imc < 19.1) {
				System.out.println("IMC " + imc + " - Abaixo do peso");
			} else if(imc <25.8) {
				System.out.println("IMC " + imc + " - No peso ideal");
			} else if(imc < 27.3) {
				System.out.println("IMC " + imc + " - Um pouco acima do peso");
			} else if(imc < 32.3) {
				System.out.println("IMC " + imc + " - Acima do peso ideal");
			} else {
				System.out.println("IMC " + imc + " - Obeso");
			}
		}
		*/
		
		
		// A && B
		
		// ___________A______________ || ___________B______________
		if((sexo == 'M' && imc < 20.7) || (sexo == 'F' && imc < 19.1)){
				System.out.println("IMC " + imc + " - Abaixo do peso");
		} else if((sexo == 'M' && imc <= 26.4) || (sexo == 'F' && imc <= 25.8)) {
				System.out.println("IMC " + imc + " - No peso ideal");
		} else if((sexo == 'M' && imc <= 27.8) || (sexo == 'F' && imc <= 27.3)) {
				System.out.println("IMC " + imc + " - Um pouco acima do peso");
		} else if((sexo == 'M' && imc <= 31.1) || (sexo == 'F' && imc <= 32.3)) {
				System.out.println("IMC " + imc + " - Acima do peso ideal");
		} else {
				System.out.println("IMC " + imc + " - Obeso");
		}
	
	}
	
}