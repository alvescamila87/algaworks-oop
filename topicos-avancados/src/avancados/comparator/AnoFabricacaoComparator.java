package avancados.comparator;

import java.util.Comparator;

public class AnoFabricacaoComparator implements Comparator<Carro>{

	@Override
	public int compare(Carro c1, Carro c2) {
		if(c1.getAnoFabricacao() < c2.getAnoFabricacao()) {
			return -1; 
		} else if(c1.getAnoFabricacao() > c2.getAnoFabricacao()) {
			return 1;
		}
		return 0;
	}

}
