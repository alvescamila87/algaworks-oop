package arrays;


public class TesteArrayCachorro {
	
	public static void main(String[] args) {
		
		Cachorro[] cachorros = new Cachorro[3];
		
		cachorros[0] = new Cachorro();
		cachorros[0].raca = "Pinscher";
		cachorros[0].nome = "Marlene";
		
		cachorros[1] = new Cachorro();
		cachorros[1].raca = "Golden Retrivier";
		cachorros[1].nome = "Rey";
		
		cachorros[2] = new Cachorro();
		cachorros[2].raca = "Golder Retrivier";
		cachorros[2].nome = "Ronda";
		
		System.out.println(cachorros[0].raca + " " + cachorros[0].nome);
		
		// Imprimir array
		
		for(int i = 0; i < cachorros.length; i++) {
			System.out.printf("Cachorro[%s] tem nome %s e é da raça %s.\n", i, cachorros[i].nome, cachorros[i].raca);
		}
		
		
	}

}
