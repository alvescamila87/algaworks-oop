package detalhes.varargs;

public class ConcatenarStrings {
	
	public String concatenar(String...palavras) {
		StringBuilder sb = new StringBuilder();
		for(String palavra : palavras) {
			sb.append(palavra);
		}
		
		return sb.toString();
	}

}
