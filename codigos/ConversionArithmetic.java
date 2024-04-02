public class ConversionArithmetic {
	
	public static void main(String[] args) {
	
		int x = 10;
		long y = 5;
		long z = x + y; // z não pode ser int
		System.out.println(z);
		
		
		long a = 10;
		float b = 9.34f;
		float c = a * b; // c não pode ser long ou int
		System.out.println(c);	
		
		int t = 3;
		int u = 2;
		float v = t / (float) u; // v será 1.0 para são dois inteiros na divisão
		System.out.println(v); // ou promove um para 'float', com casting
		
	
	}
}