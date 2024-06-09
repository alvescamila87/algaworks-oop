package detalhes.varargs;

public class CorreioEletronicoComVarArgs {
	
	public void enviarEmails(String... emails) {
		
		// Percorrer todos os e-mails recebidos
		for(String email : emails) {
			// envia e-mail
			System.out.println("E-mail enviado para: " + email);			
		}
	}

}
