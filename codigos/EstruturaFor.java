import java.util.Scanner;

public class EstruturaFor{
	public static void main(String[] main) {
	
		Scanner entrada = new Scanner (System.in);
			
		System.out.println("Informe o último número: ");
		int numeroFinal = entrada.nextInt();
		
		for (int i = 0; i < numeroFinal; i++) {
			System.out.println(i);
		}
		
	}
}