package apidata.exemplos;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

import apidata.model.Carro;

public class CadastroCarro {
	
	public static void main(String[] args) {
		
		Carro golf = new Carro("Golf GTI", 390.00, Year.of(2023));
		Carro polo = new Carro("Polo", 210.90, Year.parse("2022"));
		Carro jetta = new Carro("Jetta", 249.00, Year.of(2024));
		
		List<Carro> carros = Arrays.asList(golf, polo, jetta);
		
		// Imprimir modelos de carro, cujo ano de fabricação maior que 2022
		
		carros.stream()
			.filter(c -> c.getAnoFabricacao().getValue() > 2022)
			.forEach(c -> System.out.println(c.getModelo()));
		
		// ou
		
		carros.stream()
		.filter(c -> c.getAnoFabricacao().isAfter(Year.of(2022)))
		.forEach(c -> System.out.println(c.getModelo()));
	}

}
