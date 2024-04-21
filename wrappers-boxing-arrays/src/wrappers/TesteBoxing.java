package wrappers;

public class TesteBoxing {
		
	public static void main(String[] args) {
		
		// Boxing
		Integer i = 10; //Integer i = new Integer(10);
		
		// Unboxing
		int x = i;
		
		// Processamento mais rápido: usar os métodos
		int a = i.intValue();
		
		// Intervalo da memória
		Integer o1 = 127;
		Integer o2 = 127;
		
		Integer o3 = 128;
		Integer o4 = 128;
		
		System.out.println(o1 == o2);
		System.out.println(o2 == o4);
		
		// Comparar valores entre objetos wrappers sempre com equals(). 
		System.out.println(o1.equals(o2));
		System.out.println(o3.equals(o4));
	}
}
