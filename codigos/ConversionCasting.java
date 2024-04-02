public class ConversionCasting {
	
	public static void main(String[] args) {
	
		long x = 95000000085L;
		
		// casting
		int y = (int) x;
		
		System.out.println(y);	

		int a = 15;
		
		// casting automático
		long b = a;
		
		System.out.println(b);
		
		double m = 159.45;
		
		float n = (float) m;
		
		System.out.println(n);
		
		float o = 1576.8f; // tipo literal
		
		double p = o;
		
		System.out.println(p);
	
	}
}