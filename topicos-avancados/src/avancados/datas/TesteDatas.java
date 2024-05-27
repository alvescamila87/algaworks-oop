package avancados.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDatas {
	
	public static void main(String[] args) {
		
		// Data atual
		Date hoje = new Date();
		System.out.println(hoje);
		
		// Formatar data
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss"); //"dd-MM-yyyy HH:mm:ss"
		System.out.println(formatador.format(hoje));
		
		// Caminho contrário
		String dataAniversario = "13/12/1987";
		DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date aniversario = formatador2.parse(dataAniversario);
			System.out.println(formatador2.format(aniversario));
		} catch (ParseException e) {
			System.out.println("Formator de data inválido.");			
		}
		
		
		
		
	}

}
