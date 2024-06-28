package lambda.exemplo;

import java.util.ArrayList;
import java.util.List;

import lambda.dao.FaturaDAO;
import lambda.modelo.Fatura;
import lambda.util.EnviadorEmail;

public class ExemploLambda {
	
	public static void main(String[] args) {
		
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
				
		EnviadorEmail enviadorEmail = new EnviadorEmail();
		
		// Sem lambda
		System.out.println();
		System.out.println("SEM lambda");
		for(Fatura f : faturasVencidas) {
			enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
		}
		
		// Com lambda
		System.out.println();
		System.out.println("COM lambda");
		faturasVencidas.forEach(f -> enviadorEmail.enviar(f.getEmailDevedor(), f.resumo()));
		
		// Com lambda com bloco de código
		System.out.println();
		System.out.println("COM lambda + Bloco de cófigo de email enviado");
		faturasVencidas.forEach(f -> {
			enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
			f.setEmailEnviado(true);			
		});
		
	}

}
