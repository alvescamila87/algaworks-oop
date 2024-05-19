package classe;

public class TestePetShop {

	public static void main(String[] args) {
		
		Cachorro cao01 = new Cachorro();
		
		cao01.nome = "Marlene";
		cao01.idade = 4;
		cao01.raca = "Pinscher";
		cao01.sexo = 'F';
		
		System.out.println("INFORMAÇÕES DO CACHORRO");
		System.out.println("-------------------------------");
		System.out.println("Nome: " + cao01.nome);
		System.out.println("Raça: " + cao01.raca);
		System.out.println("Idade: " + cao01.idade);
		System.out.println("Sexo: " + cao01.sexo);
		
		Cachorro cao02 = new Cachorro();
		cao02.nome = "Dalida";
		
		if(cao01 == cao02) {
			System.out.println("Iguais");
		} else {
			System.out.println("Objetos diferentes.");
		}
		
	}
}
