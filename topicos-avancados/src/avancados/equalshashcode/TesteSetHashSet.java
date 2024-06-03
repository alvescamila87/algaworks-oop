package avancados.equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class TesteSetHashSet {
	
	public static void main(String[] args) {
		
		Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();
		
		Aluno alunoSorteado = new Aluno("Maria");
		
		if(alunos.contains(alunoSorteado)) {
			System.out.println("Parabéns, " + alunoSorteado.getNome() + "! Você ganhou um prêmio!");
		} else {
			System.out.println("Aluno não encontrado!");	
		}
		
	}

}
