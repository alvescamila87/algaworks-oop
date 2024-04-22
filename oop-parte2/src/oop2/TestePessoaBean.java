package oop2;

public class TestePessoaBean {
	
	public static void main(String[] args) {
		
		PessoaBean pb = new PessoaBean();
		pb.setNome("Patrícia");
		pb.setIdade(39);
		
		System.out.println("Nome: " + pb.getNome() + " tem " + pb.getIdade() + " anos.");
	}

}
