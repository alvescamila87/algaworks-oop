package desafiopolimorfismo;

public class Professor extends Pessoa {
	
	private String ID = "15988-ABC";

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		this.ID = iD;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("PROFESSOR");
		System.out.println("-----------------------");
		System.out.println("Professor: " + getNome());
		System.out.println("ID: " + getID());	
		System.out.println("--------------------");
	}

}
