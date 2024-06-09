package detalhes.varargs;

public class TesteCorreioEletronico1 {
	
	public static void main(String[] args) {
		
		CorreioEletronico correio = new CorreioEletronico();
		
		// Criar e-mails (poderia ser com Arraylist também
		String[] emails = new String[2];
		emails[0] = "joao@email.com";
		emails[1] = "maria@email.com";
		
		// Número de argumento obrigatório, nem que seja criar uma string com null
		correio.enviarEmails(emails);
	}

}
