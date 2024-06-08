package detalhes.jdbc.desafio;

import detalhes.jdbc.desafio.dao.DAOFactory;
import detalhes.jdbc.desafio.dao.LivroDAO;
import detalhes.jdbc.desafio.model.Livro;

public class SalvarLivro {
	
	public static void main(String[] args) {
		
		// Criar livro
		Livro livro = new Livro();
		livro.setTitulo("Java Head First");
		livro.setAutor("Sarah");
		livro.setAnoPublicacao(2023);
		
		// Salvar livro no DB
		LivroDAO livroDAO = DAOFactory.getDAOFactory().getLivroDAO();
		livroDAO.salvar(livro);
		System.out.println("Livro salvo com sucesso!");
	}

}
