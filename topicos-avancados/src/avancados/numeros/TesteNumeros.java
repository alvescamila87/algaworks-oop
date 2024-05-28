package avancados.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {
	
	public static void main(String[] args) {
		
		DecimalFormat formatador = new DecimalFormat("#,##0.00");
		double valorProduto = 13.59;		
		// R$ 1.300,59
		
		System.out.println("ANTES: " + valorProduto);
		System.out.println("DEPOIS: " + formatador.format(valorProduto));
		
		// Exemplo - Conversão de String para Número
		String entradaValor = "50.34"; //R$ 50,34
		try {
			double numero = formatador.parse(entradaValor).doubleValue();
			System.out.println("Número: " + numero);
		} catch (ParseException e) {
			System.out.println("Entrada inválida. Motivo: " + e.getMessage());
		}
		
		// Exemplo - BigDecimal
		BigDecimal bd = new BigDecimal(6503035030530360d);
		System.out.println(bd.divide(BigDecimal.TEN));
		
	}

}
