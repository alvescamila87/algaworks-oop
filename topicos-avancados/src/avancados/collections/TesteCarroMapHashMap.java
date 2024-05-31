package avancados.collections;

import java.util.HashMap;
import java.util.Map;

public class TesteCarroMapHashMap {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro("BMW");
		Carro c2 = new Carro("Mercedes");
		Carro c3 = new Carro("Audi");
		Carro c4 = new Carro("VW");
		
		Map<Integer, Carro> carros = new HashMap<>();
		
		carros.put(1, c1);
		carros.put(2, c2);
		carros.put(3, c3);
		carros.put(4, c4);
		carros.put(5, c1); // Sobrepõe o último valor
		carros.put(6, c2); // Permite mesmo objeto com chave diferente
		
		imprimirInfosCarros(carros);
		
	}
	
	public static void imprimirInfosCarros(Map<Integer, Carro> carros) {
		 // Itera sobre os valores do mapa
		for(Carro c : carros.values()) {
			System.out.println("Carro: " + c.getModelo());
		}
		
		// Itera sobre as chaves do mapa
		for(Integer chave : carros.keySet()) {
			Carro c = carros.get(chave);
			System.out.println("Chave: " + chave + ", Carro: " + c.getModelo());
		}
	}

}
