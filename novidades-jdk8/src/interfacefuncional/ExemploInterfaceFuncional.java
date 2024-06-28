package interfacefuncional;

public class ExemploInterfaceFuncional {
	
	public static void main(String[] args) {
		
		//Impressora i = new ImpressoraHP();
		//i.imprimir();			
		
		Impressora i = () -> {
			System.out.println("Simulando impressão.");
		};
	}		

}
