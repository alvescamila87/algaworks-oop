import java.util.Scanner;

public class OperadorTernario {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a idade: ");
		int idade = entrada.nextInt();
		
		//System.out.println(idade >= 18 ? "Maioridade" : "Menor");
		
		// int x = (idade >= 18) ? 1 : 2;
		
		//				exp. booleana    ? (pergunta)  valor caso verdadeiro : valor caso falso
		//String indicacao = (idade >= 18) ? "adulto" : "crianca/adolescente";
		
		// não é boa prática, mas é possível usar operador ternário aninhado
		String indicacao = (idade >= 18) ? "adulto" : (idade <= 12) ? "crianca" : "adolescente";
		
		System.out.println("Resultado: " + indicacao);
	
	}
}