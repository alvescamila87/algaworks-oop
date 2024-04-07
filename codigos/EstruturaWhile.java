import java.util.Scanner;

public class EstruturaWhile {
	public static void main(String[] args){
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe um número inicial: ");
		int numeroInicial = entrada.nextInt();
		
		System.out.println("Informe um número final: ");
		int numeroFinal = entrada.nextInt();
		
		int numeroAtual = numeroInicial;
		
		while (numeroAtual <= numeroFinal) {
			System.out.println(numeroAtual);
			numeroAtual++;
		}
	}
}