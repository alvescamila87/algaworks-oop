package avancados.collections;

import java.util.HashSet;
import java.util.Set;

public class TesteCarroSetHashSet {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro("BMW");
		Carro c2 = new Carro("Mercedes");
		Carro c3 = new Carro("VW");
		Carro c4 = new Carro("Audi");
		
		Set<Carro> carros = new HashSet<>();
		
		carros.add(c1);
		carros.add(c2);
		carros.add(c3);
		carros.add(c4);
		
		imprimirInfosCarro(carros);
				
	}
	
	public static void imprimirInfosCarro(Set<Carro> carros) {
		for(Carro c : carros) {
			System.out.println("Carro: " + c.getModelo());
		}
	}

}
