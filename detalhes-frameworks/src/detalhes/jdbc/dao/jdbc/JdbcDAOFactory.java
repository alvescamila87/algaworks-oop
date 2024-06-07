package detalhes.jdbc.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import detalhes.jdbc.dao.ClienteDAO;
import detalhes.jdbc.dao.DAOFactory;

public class JdbcDAOFactory extends DAOFactory {
	
	private Connection connection;
	
	public JdbcDAOFactory() {		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // nome de driver
			//Class.forName("com.mysql.jdbc.Driver"); DEPRICATED
			
			// Recuperar conexão com banco de dados
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost/db_cadastro_cliente","root", "12345");
			
		} catch (Exception e) {
			throw new RuntimeException("Erro recuperando conexão com o banco", e);
		}
	}

	@Override
	public ClienteDAO getClienteDAO() {
		return new JdbcClienteDAO(connection);
	}
	
	

}
