package avancados.collections.desafio;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * A classe Cargo representa o cargo de um político, como por exemplo "vereador", "deputado estadual" ou "prefeito".
 */
public class Cargo {
	
	private String descricao;
	private BigDecimal salario;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	// HashCode and Equals
	// apontando exclusivamente para a descrição, ou seja, 
	// o que vai diferir um cargo do outro, nesse caso, será o nome.
	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cargo other = (Cargo) obj;
		return Objects.equals(descricao, other.descricao);
	}
	
	
	
}
