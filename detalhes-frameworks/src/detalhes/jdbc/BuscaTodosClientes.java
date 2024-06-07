package detalhes.jdbc;

import java.util.List;

import detalhes.jdbc.dao.ClienteDAO;
import detalhes.jdbc.dao.DAOFactory;
import detalhes.jdbc.modelo.Cliente;

public class BuscaTodosClientes {
	
	public static void main(String[] args) {
		
		// Acessar banco de dados cliente
		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		
		// Retorna todos os clientes cadastrados no banco em uma lista
		List<Cliente> clientes = clienteDAO.buscarTodos();
		
		// Itera para exbir
		for(Cliente cliente: clientes) {
			System.out.println("-------------- Cliente --------------");
			System.out.printf("Código: %s\n", cliente.getCodigo());
			System.out.printf("Nome: %s\n", cliente.getNome());
		}
	}

}
