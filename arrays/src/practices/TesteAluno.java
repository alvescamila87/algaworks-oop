package practices;

import java.util.Scanner;

public class TesteAluno {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// quantidade de alunos da turma
		System.out.println("Quantidade de alunos da turma: ");
		int quantidadeAlunos = entrada.nextInt();
		
		entrada.nextLine();
		
		// instanciar um objeto turma
		Turma turma = new Turma();
		
		// instanciar um array de alunos
		turma.alunos = new Aluno[quantidadeAlunos];
		
		//percorrer array com informações do usuário
		for(int i = 0; i < turma.alunos.length; i++) {
			turma.alunos[i] = new Aluno();
			
			System.out.println("\nAluno " + i);
			System.out.println("------------------------");
			
			System.out.println("\nNome ");
			turma.alunos[i].nome = entrada.nextLine();
			
			System.out.println("Média: " );
			turma.alunos[i].media = entrada.nextDouble();
			entrada.nextLine();			
		}
		
		turma.listarInformacoes();	
		
	}

}
