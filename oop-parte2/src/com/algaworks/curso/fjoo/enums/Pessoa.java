package com.algaworks.curso.fjoo.enums;

public class Pessoa {
	
	String nome;
	TipoDocumento tipoDocumento;
	String cidade;
	
	Pessoa(){
		this.tipoDocumento = tipoDocumento.CPF;
	}
	
	Pessoa(String nome, String cidade){
		this();
		this.nome = nome;
		this.cidade = cidade;
	}
	
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", tipoDocumento=" + tipoDocumento + ", cidade=" + cidade + "]";
	}
	
	

}
