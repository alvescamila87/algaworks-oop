package detalhes.string;

public class ExercicioSubstring {
	public static void main(String[] args) {
		
		String s = "Seja você quem for, seja qual for a posição social que você tenha na vida, a mais alta ou a mais baixa, tenha sempre como meta muita força, muita determinação e sempre faça tudo com muito amor "
				+ "e com muita fé em Deus, que um dia você chega lá. De alguma maneira você chega lá.";
		
		int indice1 = s.indexOf("tenha");
		
		int indice2 = s.indexOf("lá.");
		
		System.out.println(s.substring(indice1, indice2));
		
	}

}
