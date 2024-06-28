package referencemethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicios.Aluno;
import lambda.dao.FaturaDAO;
import lambda.modelo.Fatura;

public class ExemploReferenceMethods {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		List<Aluno> alunos = new ArrayList<>();
		
		for(int x = 0; x < 2; x++) {
			
			System.out.println((x + 1) + "º - Informe o nome: ");
			String nome = entrada.nextLine();
			
			System.out.println((x + 1) + "º - Informe a idade: ");
			int idade = entrada.nextInt();
			entrada.nextLine();
			
			alunos.add(new Aluno(nome, idade));
		}
		
		/* for(Aluno a : alunos) {
			System.out.println(a.atualizandoStatus());
		} */
		
		//alunos.forEach(a -> a.atualizandoStatus()));
		
		alunos.forEach(Aluno::atualizandoStatus);
		
		// Exemplo 2
		
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		
		/* for(Fatura f : faturasVencidas) {
			f.atualizandoStatus();
		} */
		
		//faturasVencidas.forEach(f -> f.atualizandoStatus()));
		
		faturasVencidas.forEach(Fatura::atualizandoStatus);;
		
		
	}

}
