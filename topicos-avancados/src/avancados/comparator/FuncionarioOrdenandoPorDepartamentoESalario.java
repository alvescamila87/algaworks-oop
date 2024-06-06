package avancados.comparator;

import java.util.Comparator;

public class FuncionarioOrdenandoPorDepartamentoESalario implements Comparator<Funcionario>{

	@Override
	public int compare(Funcionario f1, Funcionario f2) {
		
		 // Primeiro, ordena pelo departamento
		int resultado = f1.getDepartamento().compareTo(f2.getDepartamento());
		
		// Se os departamentos forem iguais, ordena pelo salário (decrescente)
		if(resultado == 0) {
			resultado = Double.compare(f1.getSalario(), f2.getSalario());
		}
		return resultado;
	}

}
