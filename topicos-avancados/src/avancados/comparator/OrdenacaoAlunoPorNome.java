package avancados.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenacaoAlunoPorNome {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Zebedeu", 21);
		Aluno a2 = new Aluno("Rita de Cássia", 23);
		Aluno a3 = new Aluno("Carlo Acutis", 15);
		Aluno a4 = new Aluno("João", 20);
		Aluno a5 = new Aluno("Maria", 19);
		Aluno a6 = new Aluno("Princesa Isabel", 18);
		Aluno a7 = new Aluno("Antônio", 10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7);
		
		// Ordenação por nome:
		Collections.sort(alunos);
		
		for(Aluno aluno : alunos) {
			System.out.println(aluno);
		}	
		
	}

}
