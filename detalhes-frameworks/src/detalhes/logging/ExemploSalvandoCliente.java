package detalhes.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import detalhes.logging.dao.ClienteDAO;
import detalhes.logging.model.Cliente;

public class ExemploSalvandoCliente {
	
	private static Logger logger = Logger.getLogger(ExemploSalvandoCliente.class);
	
	public static void main(String[] args) {
		// Configurar log4j no arquivo application.properties
		PropertyConfigurator.configure("log4j.properties");
		
		logger.info("Iniciando a aplicação");
		
		Cliente cliente = new Cliente("Tobias");
		new ClienteDAO().salvar(cliente);
		
		new ClienteDAO().salvar(null);
		
		logger.info("Finalizando a aplicação");
	}

}
