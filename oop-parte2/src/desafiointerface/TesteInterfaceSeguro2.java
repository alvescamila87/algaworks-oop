package desafiointerface;

public class TesteInterfaceSeguro2 {
	
	public static void main(String[] args) {
		
		CorretoraSeguros corretora = new CorretoraSeguros();
		
		Barco barco = new Barco(450000, 60);
		Notebook notebook = new Notebook(7500, 7);
		
		corretora.fazerPropostaSeguro(barco);
		corretora.fazerPropostaSeguro(notebook);
		
	}

}
