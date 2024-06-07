package detalhes.jdbc;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import detalhes.jdbc.dao.ClienteDAO;
import detalhes.jdbc.dao.DAOFactory;
import detalhes.jdbc.modelo.Cliente;

public class SalvarCliente2JOptionPane {

	public static void main(String[] args) throws Exception {

		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

		// Criar cliente
		Cliente cliente = new Cliente();
		String nome = JOptionPane.showInputDialog(null, "Nome do cliente", "Cadastro de cliente",
				JOptionPane.QUESTION_MESSAGE);

		if (nome != null) {
			cliente.setNome(nome);

			// Salvar cliente no DB
			ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
			clienteDAO.salvar(cliente);
			System.out.println("Cliente salvo com sucesso.");
		}

	}

}
