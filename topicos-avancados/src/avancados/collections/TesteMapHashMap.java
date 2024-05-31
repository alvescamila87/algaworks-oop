package avancados.collections;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Princesa Isabel");
		Aluno a2 = new Aluno("Zebedeu");
		Aluno a3 = new Aluno("Davi");
		Aluno a4 = new Aluno("Judite");
		
		// Interface Map e Classe HashMap
		// Chave-Valor 
		Map<String, Aluno> alunos = new HashMap<>();		
		
		alunos.put("1", a1);
		alunos.put("2", a2);
		alunos.put("3", a3);
		alunos.put("4", a4);
		alunos.put("5", a4); // Não permite 2 chaves iguais, caso contrário ele sobrescreve o objeto
		
		imprimirAlunos(alunos);
		
		Aluno alunoRecuperado = alunos.get("3");
		System.out.println("Aluno recuperado: " + alunoRecuperado.getNome());
	}

	private static void imprimirAlunos(Map<String, Aluno> alunos) {
		for (Aluno a : alunos.values()) {
			System.out.println("Map Aluno: " + a.getNome());
		}
		
	}

}
