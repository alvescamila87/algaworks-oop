package apidata.exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;

import apidata.model.Aluguel;
import apidata.model.Carro;
import apidata.model.Cliente;

public class NovoAluguel {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Zebedeu Abraão", LocalDate.of(1987, Month.DECEMBER, 13));
		Carro carroBMW = new Carro("X4", 990.00, Year.of(2024));
		
		// criar aluguel
		
		//LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(), 
				LocalTime.of(LocalTime.now().getHour(), 0)); // hora fechada 12:00 por exemplo
		
		LocalDateTime dataEHoraPrevistaParaDevolucao = 
				LocalDateTime.now().plusDays(3).plusHours(4); // ficar 3 dias + 4h com o carro
		
		Aluguel aluguel = new Aluguel(cliente, carroBMW, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao); 
		
		
		// imprimir recibo de alocação
		imprimirRecibo(aluguel);
	}

	// refatorar metodo (função eclipse)
	private static void imprimirRecibo(Aluguel aluguel) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>> RECIBO <<<<<<<<<<<<<<<<<<<<<");
		System.out.println("Carro: " + aluguel.getCarro().getModelo());
		System.out.println("Cliente: " + aluguel.getCliente().getNome());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("Data e hora da retirada: " + aluguel.getDataEHoraDaRetirada().format(formatter));
		System.out.println("Data e hora prevista da devolução: " + aluguel.getDataEHoraPrevistaParaDevolucao().format(formatter));
	}

}
