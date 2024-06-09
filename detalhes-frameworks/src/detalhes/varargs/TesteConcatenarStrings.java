package detalhes.varargs;

public class TesteConcatenarStrings {
	
	public static void main(String[] args) {
		
		ConcatenarStrings cs = new ConcatenarStrings();
		
		System.out.println(cs.concatenar("Hello ", "world", "!"));
		
		String frase = cs.concatenar("Hey ", "guys", "!");
		
		System.out.println("Frase: " + frase);
		
	}

}
