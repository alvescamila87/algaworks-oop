package desafiopolimorfismo;

public class Aluno extends Pessoa {
	
	private String turma = "3B";
	
	public String getTurma() {
		return turma;
	}
	
	public void setTurma(String turma) {
		this.turma = turma;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("ALUNO");
		System.out.println("--------------------");
		System.out.println("Aluno: " + getNome());
		System.out.println("Turma: " + getTurma());	
		System.out.println("--------------------");
	}

}
