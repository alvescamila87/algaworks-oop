package avancados.strings;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa01 = new Pessoa();
		pessoa01.setNome("Zebedeu João");
		pessoa01.setCidade("Blumenau");
		pessoa01.setEstado("SC");
		
		// Teste String Builder
		System.out.println(pessoa01);
		
		// Teste String Buffer
		StringBuffer sbuffer = new StringBuffer(" Israel");
		sbuffer.append(" Bíblico");
		
		System.out.println(sbuffer);
		
		
	}
}
