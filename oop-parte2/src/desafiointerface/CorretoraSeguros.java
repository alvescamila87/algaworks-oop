package desafiointerface;

public class CorretoraSeguros {
	
	public void fazerPropostaSeguro(Seguravel objetoSeguravel) {
		System.out.println("--------------------------------------");
		System.out.println("Corretora de Seguros - Proposta");
		System.out.println("--------------------------------------");
		System.out.println(objetoSeguravel.obterDescricao());
		System.out.printf("Valor da apólice: R$%.2f \n", objetoSeguravel.calcularValorApolice());
		System.out.println("--------------------------------------\n");
	}

}
