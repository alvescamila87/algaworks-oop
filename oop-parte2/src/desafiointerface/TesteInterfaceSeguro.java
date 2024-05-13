package desafiointerface;

public class TesteInterfaceSeguro {
	
	public static void main(String[] args) {
		
		CorretoraSeguros corretora = new CorretoraSeguros();
		
		Carro meuCarro = new Carro(45000d, 2012);
		Imovel minhaCasa = new Imovel(920000d, 320);
		
		corretora.fazerPropostaSeguro(minhaCasa);
		corretora.fazerPropostaSeguro(meuCarro);
		
	}

}
