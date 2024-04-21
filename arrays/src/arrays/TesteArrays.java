package arrays;

public class TesteArrays {
	
	public static void main(String[] args) {
		// Array de tipos primitivos
		
		// Forma 1 de inicialização de array
		
		//int[] notas;
		//notas = new int[4];
		
		// Forma 2 de inicialização de array
		
		int[] notas = new int[7];
		
		notas[0] = 10;
		notas[1] = 5;
		notas[2] = 8;
		notas[3] = 9;
		notas[4] = 7;
		
		System.out.println("Nota do primeiro aluno: " + notas[0]);
		
		// Imprimir todo o array
		
		for(int nota : notas) {
			System.out.println(nota);
		}
		
		// Imprimir forma 2
		System.out.println("Tamanho do array: " + notas.length);
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Posição[" + i + "] = " + notas[i]);
		}
		
		
	}

}
