package detalhes.string;

public class ExercicioReplaceAll {
	
	public static void main(String[] args) {
		
		String s = "Java é uma das linguagens de programação mais populares no mundo da tecnologia.";
		System.out.println("Frase original: " + s);
		System.out.println("Frase após replace: " + s.replaceAll("Java", "Python"));
	}

}
