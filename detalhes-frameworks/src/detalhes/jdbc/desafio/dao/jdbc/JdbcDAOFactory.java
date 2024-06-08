package detalhes.jdbc.desafio.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import detalhes.jdbc.desafio.dao.DAOFactory;
import detalhes.jdbc.desafio.dao.LivroDAO;

public class JdbcDAOFactory extends DAOFactory {
	
	private Connection connection;
	
	public JdbcDAOFactory() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost/db_biblioteca", "root", "12345");
			
			
		} catch (Exception e) {
			throw new RuntimeException("Erro recuperando conexão com o banco", e);
		}
	}

	@Override
	public LivroDAO getLivroDAO() {
		return new JdbcLivroDAO(connection);
	}

}
