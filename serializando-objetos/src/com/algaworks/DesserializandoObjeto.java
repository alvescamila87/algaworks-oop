package com.algaworks;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import com.algaworks.model.Pessoa;

public class DesserializandoObjeto {
	
	public static void main(String[] args) {
		
		// Salvar objeto
				try (ObjectInput in = new ObjectInputStream(new FileInputStream("zebedeu.obj"))) {// Stream de Entrada para objeto
						Pessoa p = (Pessoa) in.readObject();
						System.out.println("Nome: " + p.getNome());
						System.out.println("Idade: " + p.getIdade());
						System.out.println("Profissão: " + p.getProfissao());
					
				} catch (IOException e) {
					System.err.println("Erro desserializando o objeto. " + e.getMessage());
					e.printStackTrace();
				} catch(ClassNotFoundException e) {
					System.err.println("Erro convertendo para a classe Pessoa. " + e.getMessage());
					e.printStackTrace();
				}
	}

}
