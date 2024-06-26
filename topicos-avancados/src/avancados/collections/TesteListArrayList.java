package avancados.collections;

import java.util.ArrayList;
import java.util.List;

public class TesteListArrayList {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Princesa Isabel");
		Aluno a2 = new Aluno("Zebedeu");
		Aluno a3 = new Aluno("Davi");
		Aluno a4 = new Aluno("Judite");
		
		// Interface List e Classe ArrayList		
		List<Aluno> alunos = new ArrayList<>();
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		// ArrayList aceita mais de um mesmo objeto na lista
		alunos.add(a4);
		
		imprimirAlunos(alunos);
	}
	
	public static void imprimirAlunos(List<Aluno> alunos) {
		for(Aluno a : alunos) {
			System.out.println("ArrayList aluno: " + a.getNome());
		}
	}

}
