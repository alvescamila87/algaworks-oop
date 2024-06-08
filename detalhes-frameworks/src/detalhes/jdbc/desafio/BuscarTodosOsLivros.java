package detalhes.jdbc.desafio;

import java.util.List;

import detalhes.jdbc.desafio.dao.DAOFactory;
import detalhes.jdbc.desafio.dao.LivroDAO;
import detalhes.jdbc.desafio.model.Livro;

public class BuscarTodosOsLivros {

	public static void main(String[] args) {

		// Acessar banco de dados cliente
		LivroDAO livroDAO = DAOFactory.getDAOFactory().getLivroDAO();

		// Retorna todos os clientes cadastrados no banco em uma lista
		List<Livro> livros = livroDAO.buscarTodos();

		// Itera para exbir
		for (Livro livro : livros) {
			System.out.println("------------------- LIVROS -----------------");
			System.out.printf("Título: %s\n", livro.getTitulo());
			System.out.printf("Autor: %s\n", livro.getAutor());
			System.out.printf("Ano de publicação: %s\n", livro.getAnoPublicacao());
		}

	}

}
