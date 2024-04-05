public class OperadoresComparacaoIgualdade{
	public static void main(String[] args){
	
		// comparação < > <= >=
		// igualdade == !=
		
		int a = 10;
		int b = 5;
		int c = 2;
		
		boolean maior = b > a;
		boolean maiorIgual = c >= 2;
		boolean menor = b < c;
		boolean menorIgual = a < b;
		boolean igual = a == b - c;
		boolean diferente = b != a;
		
		System.out.println(maior); //false
		System.out.println(maiorIgual); //true
		System.out.println(menor); //false
		System.out.println(menorIgual); //false
		System.out.println(igual); //false
		System.out.println(diferente); //true
		
		// inversão de valor (operador unário): operador que inverte valor de variável booleana
		boolean bloqueado = true;
		
		bloqueado = !bloqueado;
		
		System.out.println("Operador unário: " + bloqueado);
		
		boolean inverteValor = !(b > a);
		
		System.out.println("Inverte valor: " + inverteValor);
	
	
	}
}