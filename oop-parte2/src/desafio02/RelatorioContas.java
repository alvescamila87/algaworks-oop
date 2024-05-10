package desafio02;

public class RelatorioContas {
		
	public void exibirListagem(Conta[] contas) {
		
		System.out.println("RELATÓRIO DE CONTAS");
		System.out.println("------------------------------------");
		
		for (Conta conta : contas) {			
			conta.exibirDetalhes();
		}
	}

}
