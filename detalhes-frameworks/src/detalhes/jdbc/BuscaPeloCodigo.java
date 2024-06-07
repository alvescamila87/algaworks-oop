package detalhes.jdbc;

import detalhes.jdbc.dao.ClienteDAO;
import detalhes.jdbc.dao.DAOFactory;
import detalhes.jdbc.modelo.Cliente;

public class BuscaPeloCodigo {
	
	public static void main(String[] args) {
		
		// Acessar banco de dados cliente
		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		
		Cliente cliente = clienteDAO.buscarPeloCodigo(1L);
		
		if(cliente != null) {
			System.out.println("----------- Cliente encontrado -----------");
			System.out.printf("Código: %s\n", cliente.getCodigo());
			System.out.printf("Nome: %s\n", cliente.getNome());
			System.out.println();
		} else {
			System.out.println("Nenhum cliente encontrado.");
		}
		
	} 
	

}
