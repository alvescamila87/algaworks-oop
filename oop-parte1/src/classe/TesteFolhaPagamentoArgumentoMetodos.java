package classe;

public class TesteFolhaPagamentoArgumentoMetodos {
	
	public static void main(String[] args) {
		
		// métodos com argumentos
		FolhaPagamento folha = new FolhaPagamento();
		
		double salario = folha.calcularSalario(160, 12, 32.5, 40.2);
		
		System.out.println("Salário: " + salario);		
		
	}

}
