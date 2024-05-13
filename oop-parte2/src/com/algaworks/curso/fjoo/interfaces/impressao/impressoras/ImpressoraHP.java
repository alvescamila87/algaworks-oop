package com.algaworks.curso.fjoo.interfaces.impressao.impressoras;

import com.algaworks.curso.fjoo.interfaces.impressao.Impressora;
import com.algaworks.curso.fjoo.interfaces.impressao.Imprimivel;

public class ImpressoraHP implements Impressora  {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println();
		System.out.println("=======================================================");
		System.out.println("..........................HP...........................");
		System.out.println("=======================================================");
		
	}

}
