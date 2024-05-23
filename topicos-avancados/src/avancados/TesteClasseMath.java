package avancados;

import static java.lang.Math.PI;
import static java.lang.Math.max;

public class TesteClasseMath {

	//static final double PI = 3.1415;
	
	public static void main(String[] args) {
		
		// Comprimento de uma circunferência 2 x r x PI (3,1415)
		int raio = 4;
			// double PI = 3.1415;
			//double comprimento = 2 * raio * Math.PI;
		double comprimento = 2 * raio * PI; // import static do PI
		System.out.println("Comprimento: " + comprimento);			
		
		// Máximo e mínimo
		double[] precosProdutoA = {30.20, 25.49};
		System.out.println("Maior preço A: " + max(precosProdutoA[0], precosProdutoA[1]));
		System.out.println("Menor preço A: " + Math.min(precosProdutoA[0], precosProdutoA[1]));
		
		double[] precosProdutoB = {50.13, 102.13};
		
		double maiorPreco = max(precosProdutoB[0], precosProdutoB[1]);
		System.out.println("Maior preço B: " + maiorPreco);
		
		double menorPreco = Math.min(precosProdutoB[0], precosProdutoB[1]);
		System.out.println("Menor preço B: " + menorPreco);
		
		// Potência
		System.out.println("2^3: " + Math.pow(2, 3));
		
		// Raiz quadrada
		System.out.println("Raiz de 9: " + Math.sqrt(9));
		
		// Arredondamento ceil, floor e round
		double n = 5.68;
		System.out.println("N = " + n);
		System.out.println("Arredondamento ceil - maior inteiro de n: " + Math.ceil(n));
		
		System.out.println("Arredondamento floor - menor inteiro de n: " + Math.floor(n));
		
		System.out.println("Arredondamento round - n: " + Math.round(n));		
		
		// Trigonometria
		System.out.println("Seno: " + Math.sin(40));
		
		// Numeros randômicos
		double numeroAleatorio = Math.random() * 100;
		System.out.println("Número aleatório: " + (int) numeroAleatorio); //casting pra arrendondar pra inteiro
		
	}

}
