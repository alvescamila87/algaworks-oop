package com.algaworks.curso.fjoo.polimorfismo;

public class TestePolimorfismo {
	
	public static void main(String[] args) {
		
		
		Conta conta = new Conta();
		conta.setSaldo(4000);
		TestePolimorfismo.imprimirSaldo(conta);
		System.out.println();
		
		// ----------------------------------------------
				
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(3500);
		imprimirSaldo(contaCorrente);
		System.out.println();
		
		// ----------------------------------------------
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2000);
		imprimirSaldo(contaPoupanca);
		System.out.println();
		
		// Forma 2
		
		Conta contaCorrente2 = new ContaCorrente();
		contaCorrente2.setSaldo(23500);
		imprimirSaldo(contaCorrente2);
		System.out.println();
		
		Conta contaPoupanca2 = new ContaPoupanca();
		contaPoupanca2.setSaldo(12000);
		imprimirSaldo(contaPoupanca2);
		System.out.println();
		
	}
	
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta: R$" + conta.getSaldo());
		
		// casting do objeto
		
		if(conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente) conta; 
			System.out.println("O limite da cc é de R$" + cc.getLimite());
		}
		
		if(conta instanceof ContaPoupanca) {
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println("O rendimento da cp é de R$" + cp.getRendimento());
		}
	}

}
