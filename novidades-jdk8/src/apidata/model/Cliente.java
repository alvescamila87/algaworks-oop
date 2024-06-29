package apidata.model;

import java.time.LocalDate;

public class Cliente {
	
	private String nome;
	private LocalDate dataNascimento; // não usar a java.util Date, pois essa vem com Data + Hora
	
	public Cliente(String nome, LocalDate dataNascimento) {		
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
