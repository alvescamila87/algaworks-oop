package avancados.strings;

public class Pessoa {
	
	private String nome;
	private String cidade;
	private String estado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("PESSOA [");
		sb.append("Nome: ").append(nome);
		sb.append(", Cidade: ").append(cidade);
		sb.append(", Estado: ").append(estado);
		sb.append("]");
		
		return sb.toString();
	}

}
