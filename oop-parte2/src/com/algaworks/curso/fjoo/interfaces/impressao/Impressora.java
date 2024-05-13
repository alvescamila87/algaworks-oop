package com.algaworks.curso.fjoo.interfaces.impressao;

public interface Impressora {
	
	// classe 100% abstrata
	
	// void imprimir(); é a mesma coisa
	
	// Impressora recebe um documento imprimível:
	public void imprimir(Imprimivel imprimivel);
}
