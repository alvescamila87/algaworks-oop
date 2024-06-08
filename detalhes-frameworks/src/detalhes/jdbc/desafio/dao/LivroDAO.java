package detalhes.jdbc.desafio.dao;

import detalhes.jdbc.desafio.model.Livro;

public interface LivroDAO {
	
	public void salvar(Livro livro);

	public Livro buscarPorID(Long id);

}
