package detalhes.jdbc.desafio.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import detalhes.jdbc.desafio.dao.DAOException;
import detalhes.jdbc.desafio.dao.LivroDAO;
import detalhes.jdbc.desafio.model.Livro;

public class JdbcLivroDAO implements LivroDAO {

	private Connection connection;
	
	public JdbcLivroDAO(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public void salvar(Livro livro) {
		try {
			// Usando String.format para criar a string SQL
			String sql = String.format("insert into livro (titulo, autor, anoPublicacao) values ('%s', '%s', '%s')", livro.getTitulo(), livro.getAutor(), livro.getAnoPublicacao());
			
			// Criando o Statement
			PreparedStatement ps = this.connection.prepareStatement(sql);
			
			// Executando a consulta
			ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new DAOException("Erro salvando livro", e);
		} finally {
			try {
				this.connection.close();			
			} catch (Exception e) {}
		}
		
	}

}
