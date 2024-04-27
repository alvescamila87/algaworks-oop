package com.algaworks.curso.fjoo.enums;

public class TesteOperacaoEnum {
	
	public static void main(String[] args) {
		
		// Método manual 
		
		OperacoesAritmetica oa1 = OperacoesAritmetica.ADICAO;
		
		int resultadoAdicao01 = oa1.operacao(5, 3);
		System.out.println("O resultado da adição é: " + resultadoAdicao01);	
		
		OperacoesAritmetica oa2 = OperacoesAritmetica.SUBTRACAO;
		
		int resultadoSubtracao01 = oa1.operacao(10, 2);
		System.out.println("O resultado da subtração é: " + resultadoSubtracao01);
		
		OperacoesAritmetica oa3 = OperacoesAritmetica.MULTIPLICACAO;
		
		int resultadoMultiplicacao01 = oa3.operacao(50, 3);
		System.out.println("O resultado da multiplicação é: " + resultadoMultiplicacao01);
		
		OperacoesAritmetica oa4 = OperacoesAritmetica.DIVISAO;
		
		int resultadoDivisao01 = oa4.operacao(9, 2);
		System.out.println("O resultado da divisão é: " + resultadoDivisao01);
		
		// Método com for each
		
		for (OperacoesAritmetica oa : OperacoesAritmetica.values()) {
			System.out.println(oa + " -> " + oa.operacao(10, 2));
		}
		
	}

}
