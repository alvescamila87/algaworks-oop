package avancados.excecoes;

public class TesteCalculadora {
	
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		int soma = calc.somar(10, 5);
		System.out.println("Soma dos valores é: " + soma);
		
		// Exceção checked - Regra de negócio
		try {
			int subtracao = calc.subtrair(35, 54);
			System.out.println("Subtração dos valores é: " + subtracao);
		} catch (ValorNegativoException e) {
			System.err.println("Essa operação não pode ser realizada: " + e.getMessage());
		}
		
		
		// Exceção unchecked
		try {
			double divisao = calc.dividir(15, 0);
			System.err.println("Divisão dos valores dos valores é: " + divisao);
		} catch (ArithmeticException e) {
			System.err.println("Operação não realizada por motivos de --> \'" + e.getMessage() + "\'");
		}
		
		int multiplicacao = calc.multiplicar(225, 3);
		System.out.println("Multiplicação dos valores dos valores é: " + multiplicacao);		
		
	}

}
