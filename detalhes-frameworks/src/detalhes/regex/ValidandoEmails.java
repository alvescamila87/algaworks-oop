package detalhes.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoEmails {
	
	public static void main(String[] args) {
		
		String[] emails = {"joao@email.com", "maria@", "jose@jose", "zebedeu@email.com"};
		
		Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
		for(String email : emails) {
			Matcher matcher = pattern.matcher(email);
			if(matcher.matches()) {
				System.out.println(email + " é um e-mail válido.");
			}
		}
		
	}

}
