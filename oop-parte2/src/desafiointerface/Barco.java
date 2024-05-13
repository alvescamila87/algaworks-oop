package desafiointerface;

public class Barco implements Seguravel {
	
	private double valorMercado;
	private int quantidadePes = 15;
	
	public Barco(double valorMercado, int quantidadePes) {
		this.valorMercado = valorMercado;
		this.quantidadePes = quantidadePes;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.25;
		
		valorApolice = valorApolice + (quantidadePes * 0.60);
		
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Barco no tamanho de " + this.quantidadePes + "pés de comprimento com valor de mercado de R$" + this.valorMercado;
	}

}
