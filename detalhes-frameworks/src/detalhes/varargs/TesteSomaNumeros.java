package detalhes.varargs;

public class TesteSomaNumeros {
	
	public static void main(String[] args) {
		
		SomaNumeros soma = new SomaNumeros();
		
		int somaNumeros = soma.somar(1,2,3);
		System.out.println("A soma dos números é: " + somaNumeros);
		
		System.out.println("Nova soma: " + soma.somar(10,20,30,40));
	}

}
