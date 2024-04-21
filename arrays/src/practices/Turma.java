package practices;

public class Turma {
	
	Aluno[] alunos;
	
	void listarInformacoes() {
		System.out.println("\nInformações da turma");
		System.out.println("----------------------------");
		
		double somaMediaGeral = 0.0;
		
		for(int x = 0; x < alunos.length; x++) {
			alunos[x].exibirInfoAluno();
			
			somaMediaGeral += alunos[x].media;
		}
		
		System.out.println("\nMédia geral da turma: " + (somaMediaGeral / alunos.length));
	}

}
