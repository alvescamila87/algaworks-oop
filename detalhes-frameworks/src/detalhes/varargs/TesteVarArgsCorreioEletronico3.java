package detalhes.varargs;

public class TesteVarArgsCorreioEletronico3 {
	
	public static void main(String[] args) {
		
		CorreioEletronicoComVarArgs correio = new CorreioEletronicoComVarArgs();
		
		// Criar e-mails 
		// Número de argumentos variáveis
		correio.enviarEmails("joao@email.com", "maria@email.com", "zebedeu@email.com");
	}

}
