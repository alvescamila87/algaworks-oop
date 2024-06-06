package detalhes.string;

public class ExercicioSplit {
	
	public static void main(String[] args) {
		
		String s = "Seja você quem for, seja qual for a posição social que você tenha na vida, a mais alta ou a mais baixa, tenha sempre como meta muita força, muita determinação e sempre faça tudo com muito amor "
				+ "e com muita fé em Deus, que um dia você chega lá. De alguma maneira você chega lá.";
		
		String[] arrayAirtonSenna = s.split(" ");
		
		for(int i = 0; i < arrayAirtonSenna.length; i++) {
			System.out.println("[" + i + "]= " + arrayAirtonSenna[i]);
		}
		
		
	}

}
