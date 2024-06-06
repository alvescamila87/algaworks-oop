package detalhes.string;

public class StringEquals {
	
	public static void main(String[] args) {
		
			
		// Comparações de string com "==" e "equals"
		
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
				
	}

}
