package detalhes.string;

public class StringAtribuicao {
	
	public static void main(String[] args) {
		
		// String é imutável
		
		// Não altera
		String nome = "Camila";
		System.out.println(nome.toUpperCase());
		System.out.println("Não altera: " + nome);		
		
		// Altera com a reatribuição
		nome = nome.toUpperCase();
		System.out.println("Altera: " + nome);	
	
		
	}

}
