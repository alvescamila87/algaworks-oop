package apidata.exemplos;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

import apidata.model.Cliente;

public class CadastroCliente {
	
	public static void main(String[] args) {
		
		// Exemplo: Se fosse java.util.date
		
		/*
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.YEAR, 1980);
		c.set(Calendar.MONTH, 8);
		Date dataNascimento = c.getTime();
		
		Cliente cliente = new Cliente("João Silvar", dataNascimento);
		*/
		
		// Exemplo: Com o LocalDate
		
		// Cliente cliente = new Cliente("João Silva", LocalDate.of(1987, 12, 13));
		Cliente cliente = new Cliente("João Silva", LocalDate.of(1987, Month.DECEMBER, 13)); // Recomendado usar o enum MOUTH
		
		// Saber se o cliente tem mais de 18 anos para ser cadastrado
		int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears(); // getYears para ano, caso contrário tem meses, dias.
		
		if(idade >= 18) {
			System.out.println("Ok, pode ser cadastrado. Sua idade é: " + idade);
		} else {
			System.err.printf("Sua idade é: %s. Então não pode ter carteira.", idade);
		}
		
	}

}
