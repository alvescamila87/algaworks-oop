package detalhes.jdbc.desafio;

import detalhes.jdbc.desafio.dao.DAOFactory;
import detalhes.jdbc.desafio.dao.LivroDAO;
import detalhes.jdbc.desafio.model.Livro;

public class BuscarLivroPorID {
	
	public static void main(String[] args) {
		
		// Acessar banco de dados cliente
		LivroDAO livroDAO = DAOFactory.getDAOFactory().getLivroDAO();
		
		Livro livro = livroDAO.buscarPorID(2L);
		
		if(livro != null) {
			System.out.println("------------------- LIVRO ENCONTRADO -----------------");
			System.out.printf("Título: %s\n", livro.getTitulo());
			System.out.printf("Autor: %s\n", livro.getAutor());
			System.out.printf("Ano de publicação: %s\n", livro.getAnoPublicacao());
		}
	}

}
