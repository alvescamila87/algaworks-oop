package avancados.datas.desafio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TesteCalculadoraGravidez2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		boolean formatoValido = false;
		
		while(!formatoValido) {
			System.out.println();
			System.out.println("Informe a data do último registro menstrual (dd/mm/aaaa): ");
			String ultimoRegistroMenstrual = entrada.nextLine();
			
			try {
				System.out.println("------------------------------------------------");				
				
				Date periodoMenstrual = converterEmData(ultimoRegistroMenstrual);				
				
				CalculadoraGravidez cg = new CalculadoraGravidez(periodoMenstrual);
				System.out.println("Data estimada da concepção: " + formatarData(cg.calcularDataEstimadaConcepcao()));
				System.out.println("------------------------------------------------");
				System.out.println("Data estimada do parto: " + formatarData(cg.calcularDataEstimadaParto()));
				
				formatoValido = true;				
			} catch (ParseException e) {
				System.out.println("Formato inválido! Favor digite no formato padrão (dd/mm/aaaa).");
			}
		}
		
		entrada.close();
	}
	
	private static String formatarData(Date data) {
		// Padrão de formatação de data por extenso
		// A classe Locale representa uma região no planeta, sendo neste caso
		// o Brasil (br), onde falamos Português (pt)
		// O Locale é usado aqui para formatar a data em português brasileiro
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy", new Locale("pt", "br"));
		return formatador.format(data);		
	}
	
	private static Date converterEmData(String texto) throws ParseException {
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		return formatador.parse(texto);
	}

}
