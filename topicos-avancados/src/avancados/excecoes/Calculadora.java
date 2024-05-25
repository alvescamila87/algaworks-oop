package avancados.excecoes;

public class Calculadora {
	
	public int somar(int num1, int num2) {
		return num1 + num2;		
	}

	public int subtrair(int num1, int num2) throws ValorNegativoException {
		if(num1 <= 0 || num1 < num2) {
			throw new ValorNegativoException("ERRO: O saldo ficará negativo. Operação impedida!");
		}
		return num1 - num2;		
	}
	
	public double dividir(int num1, int num2) {
		// Exceção unchecked
		if(num2 == 0) {
			throw new ArithmeticException("Não é possível fazer divisão por ZERO.");
		}
		return (double) num1 / num2;		
	}
	
	public int multiplicar(int num1, int num2) {
		return num1 * num2;		
	}
}
