package detalhes.string;

public class StringSplit {
	
	public static void main(String[] args) {
		
		// Remover underlines e pegar os tokens da String
		
		String s = "Curso_online_desenvolvimento_de_software";
		
		String[] array = s.split("_");
		
		for (int i = 0; i < array.length; i++) {			
			System.out.println("[" + i + "]=" + array[i]);
		}
	}

}
