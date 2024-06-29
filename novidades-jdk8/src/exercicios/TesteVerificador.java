package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TesteVerificador {
	
	public static void main(String[] args) {
		
		// Implementação da lambda que verifica se a string começa com letra maiúscula
		Verificador verificaMaiuscula = s -> Character.isUpperCase(s.charAt(0));
		
		List<String> palavras = Arrays.asList("Java", "python", "csharp", "ruby");
		
		// Filtrar a lista usando a expressão lambda
		List<String> palavrasFiltradas = palavras.stream
				().filter(verificaMaiuscula::verifica)
				.collect(Collectors.toList());
		
		// Exibir as palavras filtradas
		System.out.println(palavrasFiltradas);
		
		// Exemplo 2: checar somente uma palavra
		
		String palavra = "Java";
		
		boolean resultado = verificaMaiuscula.verifica(palavra);
		
		System.out.println("A palavra começa com letra maiúscula? " + resultado);
		
		
	}

}
