package com.algaworks.curso.fjoo.polimorfismo;

public class TestePessoaPolimorfismo {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Princesa Isabel");
		TestePessoaPolimorfismo.imprimirInfo(pessoa);
		System.out.println();
		
		Aluno aluno = new Aluno();
		aluno.setNome("João");
		imprimirInfo(aluno);
		System.out.println();
		
		Professor professor = new Professor();
		professor.setNome("Maria");
		imprimirInfo(professor);
		System.out.println();
		
		// Forma 2
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Patrícia");
		imprimirInfo(pessoa2);
		System.out.println();
		
		Pessoa aluno2 = new Aluno();
		aluno2.setNome("Zebedeu");
		imprimirInfo(aluno2);
		System.out.println();
		
		Pessoa professor2 = new Professor();
		professor2.setNome("Madalena");
		imprimirInfo(professor2);
		System.out.println();
		
		
	}
	
	public static void imprimirInfo(Pessoa pessoa) {
		System.out.println("Meu nome é: " + pessoa.getNome());	
		
		if(pessoa instanceof Aluno) {
			Aluno a = (Aluno) pessoa;
			System.out.println("Estudo na turma: " + a.getTurma());
		}
		
		if(pessoa instanceof Professor) {
			Professor p = (Professor) pessoa;
			System.out.println("Meu ID é: " + p.getID());
		}
	}

}
