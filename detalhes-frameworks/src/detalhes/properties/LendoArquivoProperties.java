package detalhes.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LendoArquivoProperties {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		// Classe do Java para Properties
		Properties prop = new Properties();
		prop.load(new FileInputStream("./config/config.properties"));		
		
		// Conectar no DB
		String url = prop.getProperty("banco.dados.url");
		String usuario = prop.getProperty("banco.dados.usuario");
		String senha = prop.getProperty("banco.dados.senha");
		
		System.out.printf("Conectando no banco de dados: \nURL: %s \nusuário: %s\n", url, usuario);
		
		// Exemplo de exception que comunica o administrador por e-mail		
		try {
			// Imagina que isso veio de uma configuração errada do DB
			int x = 5 / 0;
		}catch (Exception e) {
			// Avisa o administrador por e-mail
			String email = prop.getProperty("email.admin");
			System.err.printf("Enviando email para: %s informando o erro: %s", email, e.getMessage());
		}
		
	}

}
