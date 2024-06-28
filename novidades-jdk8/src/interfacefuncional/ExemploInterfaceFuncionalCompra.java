package interfacefuncional;

public class ExemploInterfaceFuncionalCompra {
	
	public static void main(String[] args) {
		
		// Exemplo 1
		Impressora i1 = new ImpressoraHP();
		
		Compra compra1 = new Compra("Sabonete", 2.50);		
		i1.imprimir(compra1);		
		
		// Exemplo 2
		
		Compra compra2 = new Compra("Escova", 35.90);	
		
		Impressora i2 = (c) -> {
			System.out.println("Simulando impressão: " + c);
		};
		
		i2.imprimir(compra2);
	}

}
