package detalhes.varargs;

public class SomaNumeros {
	
	public int somar(int...numeros) {
		int soma = 0;
		for(int numero : numeros) {
			soma += numero;
		}
		
		return soma;
	}

}
