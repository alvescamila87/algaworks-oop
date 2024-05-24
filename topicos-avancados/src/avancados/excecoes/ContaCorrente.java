package avancados.excecoes;

public class ContaCorrente {
	
	private double saldo;
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		if(valor <= 0) {
			throw new IllegalArgumentException("O valor não pode ser menor que ZERO.");
		}
		this.saldo += valor;
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		double saldoTemporario = saldo - valor;
		
		if(saldoTemporario < 0) {
			throw new SaldoInsuficienteException("Você não possui saldo suficiente");
		}
		
		this.saldo -= valor;
	}	

}
