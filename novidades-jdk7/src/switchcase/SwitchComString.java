package switchcase;

public class SwitchComString {
	
	public static void main(String[] args) {
		
		// Switch case com string		
		
		String carro = "Audi";		
		//String carro = args.length > 0 ? [0] : "";
		
		switch(carro) {
		case "Audi":
			System.out.println("Alemão");
			break;
		case "Ferrari":
			System.out.println("Italiano");
			break;
		case "Honda":
			System.out.println("Japonês");
			break;
		}
		
	}

}
