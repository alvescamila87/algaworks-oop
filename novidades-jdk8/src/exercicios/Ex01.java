package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		List<Aluno> alunos = new ArrayList<>();
		
		ImprimirDetalhes imprimirDetalhes = new ImprimirDetalhes();
		
		for(int x = 0; x < 3; x++) {
			
			System.out.println((x + 1) + "º - Informe o nome: ");
			String nome = entrada.nextLine();
			
			System.out.println((x + 1) + "º - Informe a idade: ");
			int idade = entrada.nextInt();
			entrada.nextLine();
			
			alunos.add(new Aluno(nome, idade));
		}
		
		// Lambda
		alunos.forEach(a -> imprimirDetalhes.imprime(a.getNome(), a.getIdade()));
		
		alunos.forEach(a -> System.out.println(a.detalhes()));
	
		
	}
	
	

}
