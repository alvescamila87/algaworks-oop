package avancados.comparator;

public class Carro implements Comparable<Carro> {
	
	private String marca;
	private String modelo;
	private int anoFabricacao;	
	
	public Carro(String marca, String modelo, int anoFabricacao) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAnoFabricacao() {
		return anoFabricacao;
	}


	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}


	@Override
	public String toString() {
		return "Carro [Marca: " + marca + ", Modelo: " + modelo + ", Ano de Fabricação: " + anoFabricacao + "]";
	}


	@Override
	public int compareTo(Carro carro) {
		return this.marca.compareTo(carro.getMarca());
	}
	
	

}
