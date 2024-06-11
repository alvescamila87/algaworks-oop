package detalhes.regex;

public class SplitString {
	
	public static void main(String[] args) {
		
		String texto = "O46415641Java9é5uma3linguagem4orientada2a1objetos.";
		
		String[] palavras = texto.split("\\d+");
		for(String palavra : palavras) {
			System.out.println(palavra);
		}
	}

}
