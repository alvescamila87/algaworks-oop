package detalhes.string;

public class StringSubstring {
	
	public static void main(String[] args) {
		// Substring
		
		// public String substring(int beginIndex)
		// public String substring(int beginIndex, int endIndex)
		
		String s = "Desenvolvimento Java";
		System.out.println(s.substring(16)); // Java
		System.out.println(s);
		
		String s2 = "Cursos online de desenvolvimento de software";
		System.out.println(s2.substring(7, 12)); // onlin
	}

}
