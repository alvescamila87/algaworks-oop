package detalhes.string;

public class StringIndexOf {

	public static void main(String[] args) {
		
		// Quebrar a string e recuperar a posição da letra
		
		String s = "java@email.com";
		
		int indice = s.indexOf("a"); // primeiro "a"		
		System.out.println("Posição: " + indice);
		
		indice = s.lastIndexOf("a"); // último "a"
		System.out.println("Posição: " + indice);
		
		indice = s.indexOf("@");
		System.out.println("Posição do e-mail: " + indice);
	}
}
