package detalhes.jdbc;

import javax.swing.UIManager;

import detalhes.jdbc.dao.ClienteDAO;
import detalhes.jdbc.dao.DAOFactory;
import detalhes.jdbc.modelo.Cliente;

public class SalvaCliente {
	
	public static void main(String[] args) {		
		
		// Criar cliente
		Cliente cliente = new Cliente();
		cliente.setNome("Maria da Silva");
		
		// Salvar cliente no DB
		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		clienteDAO.salvar(cliente);
		System.out.println("Cliente salvo com sucesso.");
		
	}

}
