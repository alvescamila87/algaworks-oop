package avancados.excecoes;

public class TesteExcecoes {
	
	public static void main(String[] args) {
		
		// Exemplo 1: Lança a exceção java.lang.ArithmeticException: / by zero		
		// int numero = 5 / 0; 
		// System.out.println(numero);
		
		
		// Exemplo 2: Lança java.lang.NullPointerException: Cannot invoke "String.toLowerCase()" because "s" is null
		String s = "Um texto";
		s = null;
		// String maiuscula = s.toLowerCase(); 
		// System.out.println(maiuscula);
		
		// Exemplo 3: Lança java.lang.IllegalArgumentException: O valor não pode ser menor que ZERO.
		ContaCorrente cc = new ContaCorrente(100);
		
		try {
			cc.depositar(-10);	
			// Várias linhas de código...
		} catch (IllegalArgumentException e) {
			System.out.println("Você executou uma operação ilegal: " + e.getMessage());
		}
		
		// Exemplo 4: Exceções checadas
	
	}

}
