package com.algaworks;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.algaworks.model.Pessoa;

import java.io.FileOutputStream;

public class SerializandoObjeto {
	
	public static void main(String[] args) {
		
		// Cria objeto
		Pessoa p = new Pessoa();
		p.setNome("Zebedeu Davi");
		p.setIdade(36);
		p.setProfissao("Discípulo");
		
		// Salvar objeto
		try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("zebedeu.obj"))) {// Stream de Saída para objeto
				out.writeObject(p);
				System.out.println("Objeto salvo com sucesso.");
			
		} catch (IOException e) {
			System.err.println("Erro salvando o objeto. " + e.getMessage());
			e.printStackTrace();
		}
	}

}
