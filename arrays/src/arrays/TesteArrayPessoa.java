package arrays;

import java.util.Iterator;

public class TesteArrayPessoa {
	
	public static void main(String[] args) {
		
		Pessoa[] pessoas = new Pessoa[3];
		
		pessoas[0] = new Pessoa();
		pessoas[0].nome = "Princesa Isabel";
		
		pessoas[1] = new Pessoa();
		pessoas[1].nome = "Dom Manoel";
		
		pessoas[2] = new Pessoa();
		pessoas[2].nome = "Zebedeu Abraão";
		
		for(int x = 0; x < pessoas.length; x++) {
			System.out.println("Nome: " + pessoas[x].nome);
		}
		
	}

}
