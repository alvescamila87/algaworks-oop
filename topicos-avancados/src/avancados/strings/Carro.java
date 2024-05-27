package avancados.strings;

public class Carro {

	private String marca;
	private String modelo;
	private int ano;
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
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		StringBuffer sbuffer = new StringBuffer();
		
		sbuffer.append("CARRO [");
		sbuffer.append("Marca: ").append(marca);
		sbuffer.append(", Modelo: ").append(modelo);
		sbuffer.append(", Ano de fabricação: ").append(ano);
		sbuffer.append("]");
		
		return sbuffer.toString();
	}
}
