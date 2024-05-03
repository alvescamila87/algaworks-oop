package com.algaworks.curso.fjoo.polimorfismo;

public class TestePolimorfismo {
	
	public static void main(String[] args) {
		
		
		Conta conta = new Conta();
		conta.setSaldo(4000);
		TestePolimorfismo.imprimirSaldo(conta);
		
		// ----------------------------------------------
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(3500);
		imprimirSaldo(contaCorrente);
		
		// ----------------------------------------------
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2000);
		imprimirSaldo(contaPoupanca);
		
	}
	
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta: R$" + conta.getSaldo());
	}

}
