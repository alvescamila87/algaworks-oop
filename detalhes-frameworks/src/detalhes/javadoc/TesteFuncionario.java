package detalhes.javadoc;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Zebedeu Abraão");
		
		Funcionario f2 = new Funcionario("Princesa Isabel", 7000);
		
		System.out.printf("Adiantamento de viagem METRÓPOLE: R$%.2f\n", f2.adiantamentoViagem(5, false));
		System.out.printf("Adiantamento de viagem CAPITAL: R$%.2f\n", f2.adiantamentoViagem(5, true));
	}

}
