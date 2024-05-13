package com.algaworks.curso.fjoo.interfaces.pagamento;

public interface Operadora {
	
	// Passar documento autorizável e um cartão
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao);

}
