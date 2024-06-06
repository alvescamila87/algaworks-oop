package avancados.comparator;

public class Funcionario {
	
	private String nome;
	private double salario;
	private String departamento;
	
	public Funcionario(String nome, double salario, String departamento) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", departamento=" + departamento + "]";
	}

}
