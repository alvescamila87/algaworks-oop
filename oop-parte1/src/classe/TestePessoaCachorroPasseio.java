package classe;

public class TestePessoaCachorroPasseio {
	
	public static void main(String[] args) {
		
		// Exemplo 1 
		Pessoa p1 = new Pessoa();
		p1.nome = "Princesa Isabel";
		
		Cachorro c1 = new Cachorro();
		c1.nome = "Marlene";
		
		// atribui Marlene ao nome do cachorro de pessoa
		p1.cachorro = c1;
		
		Caminhada c = new Caminhada();
		c.andar(p1);
		
		// Exemplo 2
		Pessoa p2 = new Pessoa();
		p2.nome = "Zebedeu";
		
		p2.cachorro = new Cachorro();
		
		p2.cachorro.nome = "Marlene Theodora";
		p2.cachorro.idade = 4;
		p2.cachorro.raca = "Pinscher";
		p2.cachorro.sexo = 'F';
		
		Caminhada c2 = new Caminhada();
		c2.andar(p2);
		
	}

}
