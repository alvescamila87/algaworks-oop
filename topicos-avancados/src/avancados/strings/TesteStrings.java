package avancados.strings;

public class TesteStrings {
	
	public static void main(String[] args) {
		//String, StringBuilder e String Buffer
		
		// Concatenação de string não é boa prática
		String s = "Olá";
		s = s + " Pessoal!";
		
		System.out.println("Resultado com String: " + s);
		
		// StringBuilder
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" world!");
		
		//System.out.println(sb);
		String resultado = sb.toString();
		System.out.println("Resultado do StringBuilder: " + resultado);
	}

}
