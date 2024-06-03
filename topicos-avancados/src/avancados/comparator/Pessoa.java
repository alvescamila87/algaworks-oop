package avancados.comparator;

public class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	private int idade;	
	
	public Pessoa(String nome, int idade) {
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
	
	@Override
	public String toString() {
		return "PESSOA [" + "Nome: " + nome + ", Idade: " + idade + "]";
	}

	@Override
	public int compareTo(Pessoa pessoa) {
		// retorna -1 se this.nome tem prioridade sobre pessoa.getNome()
		// retorna 0 se são iguais
		// retorna 1 se sobre pessoa.getNome() tem prioridade de ordenação sobre this.nome
		return this.nome.compareTo(pessoa.getNome());
		
		// se fosse comparar por idade como sendo ordem natural seria:
		/* 
		if(this.idade < pessoa.getIdade()) {
		
			return -1;
		} else if(this.idade > pessoa.getIdade()) {
			return 1;
		}
		return 0;
		*/
	}

}
