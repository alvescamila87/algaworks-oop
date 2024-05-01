package com.algaworks.curso.fjoo.sobreposicao;

public class Aluno extends Pessoa {
	
	String escola;
	String turma;

	
	
	@Override
	public void imprirmirInfos() {
		super.imprirmirInfos();
		System.out.println("Escola: " + escola);
		System.out.println("Turma: " + turma);
	}
		

}
