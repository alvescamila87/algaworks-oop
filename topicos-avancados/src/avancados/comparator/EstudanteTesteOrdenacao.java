package avancados.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EstudanteTesteOrdenacao {
	
	public static void main(String[] args) {
		
		/*
		 * Enunciado: Crie uma classe Estudante com os atributos nome, idade e media. 
		 * Implemente um comparador que ordene os estudantes pela média (em ordem decrescente) 
		 * e, dentro de cada grupo de estudantes com a mesma média, ordene pelo nome (em ordem alfabética). 
		 * Crie uma lista de estudantes, ordene-a utilizando esse comparador e imprima a lista ordenada.
		 */
		
		Estudante e1 = new Estudante("Zebedeu", 15, 9.5);
		Estudante e2 = new Estudante("Maria", 21, 9.9);
		Estudante e3 = new Estudante("Madalena", 15, 6.8);
		Estudante e4 = new Estudante("José", 18, 8.7);
		Estudante e5 = new Estudante("Rute", 29, 7.5);
		Estudante e6 = new Estudante("João", 30, 7.5);
		Estudante e7 = new Estudante("Antonio", 15, 7.5);
		
		List<Estudante> listaEstudantes = Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
		
		Collections.sort(listaEstudantes, new EstudanteOrdenandoPorMediaNome());
		
		System.out.println("Ordenação por MÉDIA e NOME: ");
		for(Estudante estudante : listaEstudantes) {
			System.out.println(estudante);
		}
	}

}
