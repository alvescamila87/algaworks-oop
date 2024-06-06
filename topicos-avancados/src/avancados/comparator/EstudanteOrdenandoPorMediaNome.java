package avancados.comparator;

import java.util.Comparator;

public class EstudanteOrdenandoPorMediaNome implements Comparator<Estudante> {

	@Override
	public int compare(Estudante e1, Estudante e2) {
		
		// Primeiro ordena por média (descrente)		
		int resultado = Double.compare(e2.getMedia(), e1.getMedia());
		
		// Se a média for igual, ordena por nome;
		if(resultado == 0) {
			resultado = e1.getNome().compareTo(e2.getNome());
		}
		
		return resultado;
	}

}
