package avancados.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FuncionarioTesteOrdenacao {
	
	public static void main(String[] args) {
		
		/*
		 * Exercício: Crie uma classe Funcionario com os atributos nome, 
		 * salario e departamento. Implemente um comparador que ordene os funcionários 
		 * pelo departamento (em ordem alfabética) e, dentro de cada departamento, pelo salário 
		 * (em ordem decrescente). Crie uma lista de funcionários, ordene-a utilizando esse comparador e imprima a 
		 * lista ordenada.
		 */
		
		Funcionario f1 = new Funcionario("Zebedeu", 3000, "A");
		Funcionario f2 = new Funcionario("Davi", 1500, "B");
		Funcionario f3 = new Funcionario("Paulo", 5500, "B");
		Funcionario f4 = new Funcionario("Maria", 30000, "C");
		Funcionario f7 = new Funcionario("Rute", 1500, "C");
		Funcionario f6 = new Funcionario("Tobias", 30000, "C");
		Funcionario f5 = new Funcionario("Madalena", 7000, "A");
		
		List<Funcionario> listaFuncionarios = Arrays.asList(f1,f2,f3,f4,f5,f6,f7);
		
		Collections.sort(listaFuncionarios, new FuncionarioOrdenandoPorDepartamentoESalario());
		System.out.println("Funcionários ordenados por departamento e salário:");
		for (Funcionario funcionario : listaFuncionarios) {
			System.out.println(funcionario);
		}
	}

}
