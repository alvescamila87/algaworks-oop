package wrappers;

public class TesteClassesWrapper {
	
	public static void main(String[] args) {
		
		// tipos primitivos: byte, short, int, long, float, double e char
		// classes wrappers: Byte, Short, Integer, Long, Float, Double, Character
		
		// wrapper: envelopar um tipo primitivo em uma classe
		int x = 5;
		Integer i = new Integer(5);
		
		//xxxValue();
		byte y = i.byteValue(); // (byte) x;
		short z = i.shortValue();
		long w = i.longValue();
		
		float a = i.floatValue();
		double b = i.doubleValue();
		
		String valor = "15.5";
		Float v = new Float(valor);
		System.out.println(v + 3);
		
		int idade = Integer.parseInt("27"); // parseXXX
		System.out.println("Daqui a 5 anos você terá: " + (idade + 5) + " anos.");
		
		byte d = Byte.parseByte("127");
		System.out.println(d);
		
		double custo = Double.parseDouble("13.99");
		System.out.println("Custo: " + custo);
		
		try {
			float despesa = Float.parseFloat("Treze reais e cinquenta centavos");
			System.out.println("Despesa: " + despesa);
		} catch (NumberFormatException e) {
			System.err.println("Número inválido para conversão.");
		}
		
		
	}

}
