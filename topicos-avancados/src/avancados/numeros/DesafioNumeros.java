package avancados.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioNumeros {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe um valor de produto: ");
		double valorProduto = entrada.nextDouble();
		
		BigDecimal bd = new BigDecimal(valorProduto);		
		bd = bd.multiply(new BigDecimal(0.10));
		
		DecimalFormat formatador = new DecimalFormat("R$ #,##00.00");
		String valorMonetario = formatador.format(bd);
		
		System.out.println("Somente os 10% do valor do produto é: " + valorMonetario + ".");
	}

}
