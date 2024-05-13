package com.algaworks.curso.fjoo.interfaces.pagamento.operadoras;

import com.algaworks.curso.fjoo.interfaces.pagamento.Autorizavel;
import com.algaworks.curso.fjoo.interfaces.pagamento.Cartao;
import com.algaworks.curso.fjoo.interfaces.pagamento.Operadora;

public class OperadoraRedecard implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("456") 
				&& autorizavel.getValorTotal() < 200;
	}

}
