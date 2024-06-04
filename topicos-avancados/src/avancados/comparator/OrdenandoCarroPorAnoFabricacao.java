package avancados.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoCarroPorAnoFabricacao {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro("BMW", "X6", 2024);
		Carro c2 = new Carro("BMW", "X1", 2020);
		Carro c3 = new Carro("BMW", "X5", 2022);
		Carro c4 = new Carro("BMW", "X4", 2023);
		Carro c5 = new Carro("BMW", "X3", 2021);
		Carro c6 = new Carro("VW", "Fusca", 1960);
		Carro c7 = new Carro("Audi", "Q5", 2023);
		Carro c8 = new Carro("Audi", "Q3", 2022);
		Carro c9 = new Carro("Audi", "A5", 2024);
		Carro c10 = new Carro("Mercedes", "C180", 2024);
		Carro c11 = new Carro("VW", "Golf", 2015);
		
		List<Carro> carros = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11);
		
		// Ordenação por ano de fabricação comparator
		AnoFabricacaoComparator anoFabricacao = new AnoFabricacaoComparator();
		Collections.sort(carros, anoFabricacao);
		
		for(Carro carro : carros) {
			System.out.println(carro);
		}
		
		
	}

}
