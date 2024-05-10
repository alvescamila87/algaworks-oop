package desafiopolimorfismo;

public class TestePessoaRelatorio {
	
	public static void main(String[] args) {
		
		// Instanciando alunos
		
		Aluno aluno01 = new Aluno();
		aluno01.setNome("Zebedeu Isaias");
		
		Aluno aluno02 = new Aluno();
		aluno02.setNome("Davi");
		aluno02.setTurma("5A");
		
		Aluno aluno03 = new Aluno();
		aluno03.setNome("Abraão");
		aluno03.setTurma("10E");
		
		// Instanciando professores
		
		Professor professor01 = new Professor();
		professor01.setNome("Moisés");
		
		Professor professor02 = new Professor();
		professor02.setNome("Jacó");
		professor02.setID("FFW-93285");
		
		Professor professor03 = new Professor();
		professor03.setNome("Samuel");
		professor03.setID("GGG-745161");
		
		// Exibe listagem de pessoas
		
		RelatorioPessoas relatorioPessoas = new RelatorioPessoas();
		
		Pessoa[] pessoas = new Pessoa[] {aluno01, aluno02, aluno03, professor01, professor02, professor03};
		
		relatorioPessoas.listarPessoas(pessoas);
		
		
		
	}

}
