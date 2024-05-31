package avancados.collections;

import java.util.ArrayList;
import java.util.List;

public class TesteCarroListArrayList {
	
	public static void main(String[] args) {
		
		Carro c01 = new Carro("BMW");
		Carro c02 = new Carro("Mercedes");
		Carro c03 = new Carro("Audi");
		Carro c04 = new Carro("VW");
		
		List<Carro> carros = new ArrayList();
		
		carros.add(c01);
		carros.add(c02);
		carros.add(c03);
		carros.add(c04);
		
		imprimirInfosCarro(carros);
		
	}
	
	public static void imprimirInfosCarro(List<Carro> carros) {
		for(Carro c : carros) {
			System.out.println("Carro: " + c.getModelo());
		}
	}

}
