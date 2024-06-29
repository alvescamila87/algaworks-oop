package exercicios;

public class TesteOperacao {
	
	public static void main(String[] args) {
		
		Operacao soma = (a, b) -> a + b;
		
		Operacao multiplicacao = (a, b) -> a * b;
		
		int resultadoSoma = soma.calc(5,3);
		
		int resultadoMultiplicacao = multiplicacao.calc(8, 8);
		
		System.out.println("Resultado da soma: " + resultadoSoma);
		System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
	}

}
