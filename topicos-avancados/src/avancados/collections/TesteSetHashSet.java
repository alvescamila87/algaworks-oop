package avancados.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TesteSetHashSet {
	
	public static void main(String[] args) {		
		Aluno a1 = new Aluno("Princesa Isabel");
		Aluno a2 = new Aluno("Zebedeu");
		Aluno a3 = new Aluno("Davi");
		Aluno a4 = new Aluno("Judite");
		
		// Não aceita repetição (duplicidade de objeto)
		Set<Aluno> alunos = new HashSet<>();
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);	
		alunos.add(a4); // Não aceita repetição (duplicidade de objeto)	
		
		imprimirInfos(alunos);
	}
	
	public static void imprimirInfos(Set<Aluno> alunos) {		
		for (Aluno a : alunos) {
			System.out.println("SetList Aluno: " + a.getNome());
		}
	}

}
