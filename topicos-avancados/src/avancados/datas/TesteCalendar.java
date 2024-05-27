package avancados.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalendar {
	
	public static void main(String[] args) {
		
		// Criar data em calendário
		Calendar c = new GregorianCalendar();
		
		c.set(Calendar.DAY_OF_MONTH, 27);
		c.set(Calendar.MONTH, 4); // mês começa em contador zero. Logo 4 é maio.
		c.set(Calendar.YEAR, 2024);
		c.set(Calendar.HOUR_OF_DAY, 16);
		c.set(Calendar.MINUTE, 30);
		c.set(Calendar.SECOND, 0);
		
		DateFormat formatador3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador3.format(c.getTime()));
			
		// Adicionar (somar) dia
		c.add(Calendar.DAY_OF_MONTH, 5);
		System.out.println(formatador3.format(c.getTime()));
		
		// Adicionar (somar) mês
		c.add(Calendar.MONTH, 1);
		System.out.println(formatador3.format(c.getTime()));
		
		// Subtrair (somar) mês
		c.add(Calendar.MONTH, -7);
		System.out.println(formatador3.format(c.getTime()));
		
		// Rolar (somar) dia
		c.roll(Calendar.DAY_OF_MONTH, 12);
		System.out.println(formatador3.format(c.getTime()));
	}

}
