package separador;

public class ExemploSeparadorDigitosLiterais {
	
	public static void main(String[] args) {
		
		// Separador (apenas efeito visual)
		long populacaoSaoPaulo = 11_000_000L;
		long populacaoGrandeSaoPaulo = 11_000_000L + 9_000_000;
		
		System.out.println("População de SP: " + populacaoSaoPaulo);
		System.out.println("População da Grande SP: " + populacaoGrandeSaoPaulo);
		
		double precoVeiculo = 200_000.99_1d;
		System.out.printf("Preço do veículo: %.3f\n", precoVeiculo);
		
		// Evite usar assim
		int x = 1___2___3;
		int y = 1_2_3;
		System.out.println("X é igual Y? " +  (x == y));
	}

}
