package oop2;

public class TesteConstrutorPessoa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Zebedeu");
		
		System.out.println("Nome: " + p1.nome + " " + "idade: " + p1.idade);
		
		//p1.nome = "Camila";
		p1.idade = 36;
		
		Pessoa p2 = new Pessoa("Princesa Isabel", 40);
		System.out.println("Nome: " + p2.nome + " " + "idade: " + p2.idade);
		
		
	}
	

}
