package detalhes.jdbc.desafio.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public Livro buscarPorID(Long id) {
		Livro livro = null;
		
		try {
			
			//  Buscar todos os dados do livro onde o ID é igual ao valor fornecido
			String sql = String.format("select * from livro where id = %d", id);
			
			// Prepara a consulta SQL utilizando a conexão existente
			PreparedStatement ps = this.connection.prepareStatement(sql);
			
			// Executa a consulta e obtém os resultados em um ResultSet
			ResultSet rs = ps.executeQuery();
			
			// Itera sobre o ResultSet enquanto houver dados
			while(rs.next()) {
				
				// Cria uma nova instância de Livro
				livro = new Livro();
				
				// Define os dados do livro com o valores obtidos do ResultSet
				livro.setId(rs.getLong("id"));
				livro.setTitulo(rs.getString("titulo"));
				livro.setAutor(rs.getString("autor"));
				livro.setAnoPublicacao(rs.getInt("anoPublicacao"));
			}
		} catch (SQLException e) {
			throw new DAOException("Erro buscando livro", e);
		} finally {
			try {
				this.connection.close();			
			} catch (Exception e) {}
		}		
		
		return livro;
	}

	@Override
	public List<Livro> buscarTodos() {
		// Retornar lista de clientes
		List<Livro> livros = new ArrayList<>();
		
		try {
			// Buscar todos os livros
			String sql = String.format("select * from livro");

			// Prepara a consulta SQL utilizando a conexão existente
			PreparedStatement ps = this.connection.prepareStatement(sql);

			// Executa a consulta e obtém os resultados em um ResultSet
			ResultSet rs = ps.executeQuery();

			// Itera sobre o ResultSet enquanto houver dados
			while (rs.next()) {

				// Cria uma nova instância de Livro
				Livro livro = new Livro();

				// Define os dados do livro com o valores obtidos do ResultSet
				livro.setId(rs.getLong("id"));
				livro.setTitulo(rs.getString("titulo"));
				livro.setAutor(rs.getString("autor"));
				livro.setAnoPublicacao(rs.getInt("anoPublicacao"));
				
				// Adiciona na lista de livros cadastrados
				livros.add(livro);
			}
		} catch (SQLException e) {
			throw new DAOException("Erro buscando livro", e);
		} finally {
			try {
				this.connection.close();			
			} catch (Exception e) {}
		}
		
		return livros;
	}
	
	
	

}
