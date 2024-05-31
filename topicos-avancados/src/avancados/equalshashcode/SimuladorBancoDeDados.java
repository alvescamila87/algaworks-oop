package avancados.equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class SimuladorBancoDeDados {
	
	public static Set<Aluno> buscarAlunos() {
		
		Set<Aluno> alunos = new HashSet<>();
		alunos.add(new Aluno("João"));
		alunos.add(new Aluno("Maria"));
		alunos.add(new Aluno("João"));
		
		return alunos;
		
	}

}
