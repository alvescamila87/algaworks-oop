package classe;

public class TesteCarroReferenciaObjeto {
	
	public static void main(String[] args) {
		
		Proprietario dono1 = new Proprietario();
		dono1.nome = "Timóteo Zebedeu";
		
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Polo";
		
		// Variável referência abjeto
		meuCarro.dono = dono1;
		
		meuCarro.dono.nome = "Princesa Isabel";
		
		// Teste
		System.out.println("meuCarro.dono.nome: " + meuCarro.dono.nome);
		System.out.println("dono1.nome: " + dono1.nome);
		
		// Teste 2 - Objeto com mesmo nome
		Proprietario dono2 = new Proprietario();
		dono2.nome = "João da Silva";
		
		Carro carro1 = new Carro();
		carro1.modelo = "Fusca";
		
		Carro carro2 = new Carro();
		carro2.modelo = "Gol";
				
		carro1.dono = dono2;
		carro2.dono = dono2;
		
		System.out.println();
		System.out.println("ANTES DA MUDANÇA DE DONO");
		System.out.println("Dono 2: " + dono2.nome);
		System.out.println("Carro 1 Dono: " + carro1.dono.nome);
		System.out.println("Carro 2 Dono: " + carro2.dono.nome);
		
		carro1.dono.nome = "Abraão Moisés"; //referencia o MESMO objeto, pois isso altera para os dois carros
		
		System.out.println();
		System.out.println("DEPOIS DA MUDANÇA DE DONO");
		System.out.println("Dono 2: " + dono2.nome);
		System.out.println("Carro 1 Dono: " + carro1.dono.nome);
		System.out.println("Carro 2 Dono: " + carro2.dono.nome);
		
		
	}

}
