import java.util.Scanner;

public class MultaVeiculo {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Tipo de veículo (passeio, caminhao): ");
		String tipoVeiculo = entrada.nextLine();
		
		System.out.println("Velocidade máxima da via: ");
		int velocidadeMaxima = entrada.nextInt();
		
		System.out.println("Velocidade do veículo: ");
		int velocidadeVeiculo = entrada.nextInt();
		
		if((tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.10) ||  
		(tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05)) {
			System.out.println("Veículo deve ser multado!");
		}	
		
	}
}