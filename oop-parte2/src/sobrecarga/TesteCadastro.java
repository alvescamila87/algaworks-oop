package sobrecarga;

public class TesteCadastro {
	
	public static void main(String[] args) {
		
		CadastroPessoa cp = new CadastroPessoa();
		
		Pessoa pessoa1 = new Pessoa("João", 36);
		
		cp.cadastrar(pessoa1);
		
		// sobrecarga método 2
		
		cp.cadastrar("Maria", 24);
		
		// sobrecarga método 3
		cp.cadastrar("Zebedeu");
	}

}
