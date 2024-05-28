package avancados.datas.desafio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TesteCalculadoraGravidez1 {
	
	public static void main(String[] args) {
		
		new TesteCalculadoraGravidez1();	
		
	}
	
	public TesteCalculadoraGravidez1() {
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println("Data do último período menstrual (DD/MM/AAAA): ");
			String ultimoPeriodoMenstrual = entrada.nextLine();
			
			Date dataUltimoPeriodoMenstrual = this.converterEmData(ultimoPeriodoMenstrual);
			CalculadoraGravidez calculadora = new CalculadoraGravidez(dataUltimoPeriodoMenstrual);
			
			Date dataEstimadaConcepcao = calculadora.calcularDataEstimadaConcepcao();
			System.out.println("Data estimada da concepção: " + this.formatarData(dataEstimadaConcepcao));
			
			Date dataEstimadaParto = calculadora.calcularDataEstimadaParto();
			System.out.println("Data estimada do parto: " + this.formatarData(dataEstimadaParto));
			
		} catch (ParseException pe) {
			System.out.println("Informe uma daa no padrão dd/mm/aaaa.");
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
	
	private Date converterEmData(String texto) throws ParseException {
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		return formatador.parse(texto);
	}

}
