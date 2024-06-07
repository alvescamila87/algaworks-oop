package detalhes.jdbc.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import detalhes.jdbc.dao.ClienteDAO;
import detalhes.jdbc.dao.DAOException;
import detalhes.jdbc.modelo.Cliente;

public class JdbcClienteDAO implements ClienteDAO {
	
	// Sempre do pacote java.sql, não do mysql
	private Connection connection;
	
	// Construtor do Connection
	public JdbcClienteDAO(Connection connection) {
		super();
		this.connection = connection;
	}

	@Override
	public void salvar(Cliente cliente) {
		String sql = String.format("insert into cliente (nome) values ('%s')", cliente.getNome());
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(sql);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new DAOException("Erro salvando cliente", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {}
		}
		
	}

	@Override
	public Cliente buscarPeloCodigo(Long codigo) {
		Cliente cliente = null;
		
		try {
			String sql = String.format("select * from cliente where codigo = %d", codigo);
			PreparedStatement ps = this.connection.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery(); // tabela de busca
			
			// Itera enquanto tiver dado
			while (rs.next()) {
				// Cria cliente
				cliente = new Cliente();
				cliente.setCodigo(rs.getLong("codigo"));
				cliente.setNome(rs.getString("nome"));
			}
			
		} catch (SQLException e) {
			throw new DAOException("Erro buscando cliente", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e){}
		}
		return cliente;
	}

	@Override
	public List<Cliente> buscarTodos() {
		// Retornar lista de clientes
		List<Cliente> clientes = new ArrayList<>();
		
		try {
			String sql = "select * from cliente";
			PreparedStatement ps = this.connection.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			// Itera enquanto tiver dado
			while(rs.next()) {
				// Cria cliente
				Cliente cliente = new Cliente();
				cliente.setCodigo(rs.getLong("codigo"));
				cliente.setNome(rs.getString("nome"));
				
				// Adiciona na lista
				clientes.add(cliente);
			}
			
		} catch (SQLException e) {
			throw new DAOException("Erro buscando cliente", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e){}
		}
		return clientes;
	}
	
	
	
	

}
