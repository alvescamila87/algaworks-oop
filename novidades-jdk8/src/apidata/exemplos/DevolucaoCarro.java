package apidata.exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

import apidata.model.Aluguel;
import apidata.model.Carro;
import apidata.model.Cliente;

public class DevolucaoCarro {
	
	public static void main(String[] args) {
		// 46 dias de atraso * 9 = 414.00
		// Devolucao do carro pelo mtorista
		Aluguel aluguel = recuperarAluguel();
		
		// Para cada hora de atraso, ele paga 10% do valor do carro em multa
		LocalDateTime dataEHoraRealDaDevolução = LocalDateTime.of(LocalDate.now().plusDays(5), LocalTime.now());
		
		// Setar data e hora real da devolução
		aluguel.setDataEHoraRealDaDevolucao(dataEHoraRealDaDevolução);
		
		// Cálculo do valor da multa
		aluguel.imprimeFatura();
		
		
	}
	
	public static Aluguel recuperarAluguel() {
	
		// criar cliente
		Cliente cliente = new Cliente("Zebedeu Abraão", LocalDate.of(1987, Month.DECEMBER, 13));
		
		// criar carro
		Carro carroBMW = new Carro("X4", 90.00, Year.of(2024));
		
		// criar aluguel
		
		//LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(), 
				LocalTime.of(LocalTime.now().getHour(), 0)); // hora fechada 12:00 por exemplo
		
		LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now()
					.plusDays(3)
					.plusHours(2); 
		
		Aluguel aluguel = new Aluguel(cliente, carroBMW, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
		
		return aluguel;
	}

}
