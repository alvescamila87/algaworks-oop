package stream;

import java.util.List;
import java.util.stream.Stream;

import lambda.dao.FaturaDAO;
import lambda.modelo.Fatura;

public class ExemploStream {
	
	public static void main(String[] args) {	
		
		// Buscar fatura maiores que R$ 250,00
		List<Fatura> faturas = new FaturaDAO().buscarFaturasVencidas();
		
		// Sem stream()
		System.out.println();
		System.out.println("Sem stream()");
		for(Fatura f : faturas) {
			if(f.getValor() > 250.00) {
				System.out.println("Alerta: Fatura acima de R$ 250.00 -> " + f);
			}					
		}
		
		// Com stream() - Exemplo 1
		System.out.println();
		System.out.println("Com stream() - Exemplo 1");
		
		// filtrar
		Stream<Fatura> streamFaturas = faturas.stream()
											.filter(f -> f.getValor() > 250);
		// imprimir (a nova lista de stream)				
		streamFaturas.forEach(f -> System.out.println(f));
		
		// Com stream() - Exemplo 2
		System.out.println();
		System.out.println("Com stream() - Exemplo 2");
		
		faturas.stream()
			.filter(f -> f.getValor() > 250)
			.forEach(f -> System.out.println(f));
		
		
		// Com stream() - Exemplo 3
				System.out.println();
				System.out.println("Com stream() - Exemplo 3: com método boolean na filtragem");
				
		faturas.stream()
			.filter(f -> f.estaEmRisco())
			.forEach(f -> System.out.println(f)); 
		
		// Com stream() - Exemplo 4
		System.out.println();
		System.out.println("Com stream() - Exemplo 4: com reference methods");
		
		faturas.stream()
		.filter(Fatura::estaEmRisco)
		.forEach(f -> System.out.println(f)); 
		
		
		// Com stream() - Exemplo 5
				System.out.println();
				System.out.println("Com stream() - Exemplo 5: com reference methods no println");
		
		faturas.stream()
		.filter(Fatura::estaEmRisco)
		.forEach(System.out::println); 
	}

}
