package detalhes.debug;

public class Fibonacci {
	
	// F(n) = F(n-1) + F(n-2)
	// calcula(posicao -1 ) + calcula(posicao - 2);
	// 1, 1, 2, 3, 5, 8, ...
	// Regra de parada (if): F(0) = 0, F(1) =1
	public static long calcula(long posicao) {
		if(posicao == 0 || posicao == 1) {
			return posicao;
		}
		//long valor = calcula(posicao - 1) + calcula(posicao - 2);
		//return valor;
		long valor1 = calcula(posicao - 1);
		long valor2 = calcula(posicao - 2);
		return valor1 + valor2;
	}

}
