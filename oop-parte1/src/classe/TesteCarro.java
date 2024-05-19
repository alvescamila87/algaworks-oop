package classe;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Carro meuCarro; //declaramos a variável
		meuCarro = new Carro(); //instanciamos a variável com um objeto do tipo Carro
		
		Carro seuCarro = new Carro(); // objetos diferentes
		
		// Acessando atributos de objetos
		
		meuCarro.fabricante = "VW";
		meuCarro.modelo = "Polo";
		meuCarro.anoDeFabricacao = 2024;
		meuCarro.cor = "Preto";
		
		seuCarro.fabricante = "BWM";
		seuCarro.modelo = "X6";
		seuCarro.anoDeFabricacao = 2023;
		seuCarro.cor = "Branco";
		
		System.out.println("Meu carro");
		System.out.println("---------------------");
		System.out.println("Fabricante: " + meuCarro.fabricante);
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano de fabricação: " + meuCarro.anoDeFabricacao);
		System.out.println("Cor: " + meuCarro.cor);
		
			
		System.out.println("\nSeu carro");
		System.out.println("---------------------");
		System.out.println("Fabricante: " + seuCarro.fabricante);
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Ano de fabricação: " + seuCarro.anoDeFabricacao);
		System.out.println("Cor: " + seuCarro.cor);
		
		
		// Proprietário
		Proprietario dono01 = new Proprietario();
		dono01.nome = "Camila Maria";
		dono01.cpf = "999.000.666-11";
		dono01.idade = 36;
		dono01.logradouro = "Rua da Esquina, 13";
		dono01.bairro = "Novidade";
		dono01.cidade = "Gramado";
		meuCarro.dono = dono01;
		
		System.out.println("\nINFORMAÇÕES DO PROPRIETÁRIO");
		System.out.println("---------------------");
		System.out.println("Dono do carro: " + meuCarro.dono.nome);
		
		// Outra forma de instanciar os atributos
		
		seuCarro.dono = new Proprietario();
		seuCarro.dono.nome = "Zebedeu Abrãao";
		seuCarro.dono.idade = 33;
		seuCarro.dono.cpf = "333.777.666.44";
		seuCarro.dono.logradouro = "Rua do Lado, 22";
		seuCarro.dono.cidade = "Bento Gonçalves";
		seuCarro.dono.bairro = "Quadrado";
		
		System.out.println("Proprietário carro 02: " + seuCarro.dono.nome);
		
		
				
		
	}

}
