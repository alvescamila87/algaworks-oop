package classe;

public class Paciente {
	
	double peso;
	double altura;
	
	// método com return double
	double calcularIndiceDeMassaCorporal() {
	
		double imc = peso / (altura * altura);
		
		// int x = 10;
		// return x;
		 
		return imc;
	}
	
	// método com return tipo objeto
	IMC calcularIndiceDeMassaCorporal2() {
		 
		 IMC imc = new IMC();
		 
		 double indice = peso / (altura * altura);
		 imc.indice = indice;
		 
		 if(indice < 18.5) {
			 imc.abaixoDoPesoIdeal = true;
		 } else if (indice < 25) {
			 imc.pesoIdeal = true;
		 } else {
			 imc.obeso = true;
			 
			 if(indice < 30) {
				 imc.grauObesidade = "Acima do peso";
			 } else if (indice < 35) {
				 imc.grauObesidade = "I";
			 } else if (indice < 40) {
				 imc.grauObesidade = "II";				 
			 } else {
				 imc.grauObesidade = "III";
			 }
		 }
		 
		 return imc;
		 
	 }
	

}
