package detalhes.jdbc.desafio.dao;

import detalhes.jdbc.desafio.dao.jdbc.JdbcDAOFactory;

public abstract class DAOFactory {
	
	public static DAOFactory getDAOFactory() {
		return new JdbcDAOFactory();
	}
	
	public abstract LivroDAO getLivroDAO();

}
