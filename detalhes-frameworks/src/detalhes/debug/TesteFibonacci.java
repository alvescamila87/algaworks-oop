package detalhes.debug;

public class TesteFibonacci {
	
	public static void main(String[] args) {
		
		long posicao = 2;
		long valor = Fibonacci.calcula(posicao);
		
		System.out.println("F(" + posicao + ") = " + valor);
	}

}
