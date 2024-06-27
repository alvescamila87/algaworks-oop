package diamond;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExemploDiamondListas {
	
	public static void main(String[] args) {
		
		List<String> nomeClientes = new ArrayList<>();
		nomeClientes.add("João");
		nomeClientes.add("Zebedeu");
		
		// Exemplo 2
		Map<String, Set<String>> carrosPorMontadora = new HashMap<>();
		carrosPorMontadora.put("Chevrolet", new HashSet<String>());
		carrosPorMontadora.get("Chevrolet").add("Cruze");
		
		//Exemplo 3 (não recomendado, mas funciona)
		Set<String> carrosDaVolks;
		carrosPorMontadora.put("Volks", carrosDaVolks = new HashSet<>());
		carrosPorMontadora.get("Volks").add("Gol");
		
		
		
	}
	

}
