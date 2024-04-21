package practices;

import java.util.Scanner;

public class TesteProduto {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		// obtém a quantidade de produtos que o usuário deseja informar
		System.out.println("Informe a quantidade de produtos: ");
		int quantidadeProdutos = entrada.nextInt();
		
		// Precisamos dessa linha extra para garantir que uma nova linha seja lida
		entrada.nextLine();
		
		// instancia um objeto da classe Estoque
		Estoque estoque = new Estoque();
		
		// instancia um array de produtos com a quantidade posições que o usuário informou
		estoque.produtos = new Produto[quantidadeProdutos];
		
		// percorre todas as posições no array (que estão nulas) 
		// e preenche um a uma com a entrada do teclado do usuário
		
		for(int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new Produto();
			
			System.out.println("\nProduto " + i);
			System.out.println("--------------------------");
			
			System.out.println("Descrição: ");
			estoque.produtos[i].descricao = entrada.nextLine();
			
			System.out.println("Quantidade de itens: ");
			estoque.produtos[i].quantidade = entrada.nextInt();
			entrada.nextLine();
		}
		
		estoque.listarProdutos();
		
	}

}
