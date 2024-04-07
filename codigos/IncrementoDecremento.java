public class IncrementoDecremento {
	public static void main(String[] args) {
		
		int idade = 10;
		
		// incremento
		
		// opção 1: idade = idade + 1;
		// opção 2: idade += 1;
		// opção 3: idade ++;
		
		//int novaIdade = idade++; não funciona o incremento //10 em nova idade primeiro antes de fazer incremento
		
		int novaIdade = ++idade;
		
		System.out.println("Nova idade: " + novaIdade);
		System.out.println("Idade: " + idade);
		
		int numero = 13;

		int novoNumero = --numero;
		
		System.out.println("Novo número: " + novoNumero); //12
		System.out.println("Número: " + numero); // 12
	}
}