package exercicios;

public class Aluno {
	
	private String nome;
	private int idade;	
	
	public Aluno() {}
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}	

	public String detalhes() {
		return "nome: " + nome + " tem " + idade + " anos.\n";
	}
	
	public void atualizandoStatus() {
		System.out.println("Atualizando status do aluno: " + this.nome + ".");
	}

}
