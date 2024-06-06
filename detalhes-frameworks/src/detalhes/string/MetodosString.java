package detalhes.string;

public class MetodosString {
	
	public static void main(String[] args) {
		
		// String é imutável
		
		// Não altera
		String nome = "Camila";
		System.out.println(nome.toUpperCase());
		System.out.println("Não altera: " + nome);		
		
		// Altera com a reatribuição
		nome = nome.toUpperCase();
		System.out.println("Altera: " + nome);
		
		// --------------------------------------------------------
		
		// Comparações de string
		
		String s1 = "Pedro"; 
		String s2 = "Pedro"; // variável aponta para o mesmo lugar que s1		
		System.out.println("Comparação: s1 == s2? " + (s1 == s2));
		
		String s3 = new String("Pedro"); 
		System.out.println("Comparação: s3 == s1? " + (s3 == s1)); // conteúdo da string é o mesmo, mas o new criou novo objeto
		
		// Jeito certo de comprar conteúdo de strings e não mais onde elas apontam
		System.out.println("s1.equals(s2)? " + s1.equals(s2));
		System.out.println("s3.equals(s1)? " + s3.equals(s1));
		
		// Equals Ignore Case
		String s4 = "PeDro";
		System.out.println("s4.equals(s1)? " + s4.equals(s1));
		System.out.println("s4.equalsIgnoreCase(s1)? " + s4.equalsIgnoreCase(s1));
		
		// Cadeia de caracteres
		
		String s = "ALGAWORKS";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(6));
		System.out.println(s.charAt(7));
		System.out.println(s.charAt(8));
		
		// Contagem
		System.out.println("Total de caracteres: " + s.length()); // contagem total
		
		System.out.println(s.charAt(8)); // última posição
	}

}
