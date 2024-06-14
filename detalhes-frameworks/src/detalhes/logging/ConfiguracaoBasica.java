package detalhes.logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ConfiguracaoBasica {
	
	// Objeto que escreve o Log
	private static Logger logger = Logger.getLogger(ConfiguracaoBasica.class);
	
	public static void main(String[] args) {
		
		// Configurar log
		BasicConfigurator.configure();
		
		// Log4J
		logger.info("Começando a aplicação");		
		//Código da aplicação...
		logger.info("Finalizando a aplicação");	
		

	}

}
