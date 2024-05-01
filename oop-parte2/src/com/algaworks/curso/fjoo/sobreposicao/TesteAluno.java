package com.algaworks.curso.fjoo.sobreposicao;

public class TesteAluno {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Zebedeu Davi";
		aluno1.idade = 15;
		aluno1.cidade = "Blumenau";
		aluno1.escola = "Escola de Finanças";
		aluno1.turma = "7A";
		
		aluno1.imprirmirInfos();
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Abraão Saulo";
		aluno2.idade = 116;
		aluno2.cidade = "Pomerode";
		aluno2.escola = "Escola de Matemática";
		aluno2.turma = "3B";
		
		System.out.println();		
		aluno2.imprirmirInfos();
	}

}
