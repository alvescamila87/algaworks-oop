package detalhes.varargs;

public class TesteCorreioEletronico2 {
	
	public static void main(String[] args) {
		
		CorreioEletronico correio = new CorreioEletronico();
		
		// Criar e-mails
		// Número de argumento obrigatório, nem que seja criar uma string com null
		correio.enviarEmails(new String[] {"joao@email.com", "maria@email.com"});
	}

}
