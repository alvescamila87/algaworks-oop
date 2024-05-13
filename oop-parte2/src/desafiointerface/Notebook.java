package desafiointerface;

public class Notebook implements Seguravel {
	
	private double valorMercado;
	private int memoriaRam;
	
	public Notebook(double valorMercado, int memoriaRam) {
		this.valorMercado = valorMercado;
		this.memoriaRam = memoriaRam;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.2;
		if(memoriaRam < 2) {
			valorApolice = valorApolice + (memoriaRam * 0.35);
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Notebook com " + this.memoriaRam + "gb de memória RAM, com valor de mercado " + this.valorMercado;
	}
	
	

}
