package detalhes.generics;

import java.util.ArrayList;
import java.util.List;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		// Uso de generics <E>
		List<Funcionario> funcionarios = new ArrayList<>();
		
		funcionarios.add(new Funcionario("João"));
		funcionarios.add(new Funcionario("Isabel"));
		
		for (int i = 0; i < funcionarios.size(); i++) {
			Funcionario f = funcionarios.get(i);
			
			System.out.println("Nome do funcionário: " + f.getNome());
		}
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println("Nome do funcionário: " + funcionario.getNome());
		}
		
	}

}
