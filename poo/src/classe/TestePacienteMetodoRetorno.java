package classe;

public class TestePacienteMetodoRetorno {
	
	public static void main(String[] args) {
		
		Paciente p = new Paciente();
		p.peso = 150;
		p.altura = 1.61;
		
		// método com retorno double		
		double imcCalculado = p.calcularIndiceDeMassaCorporal();
		
		System.out.println();
		System.out.println("TIPO DE RETORNO: MÉTODO DOUBLE");
		System.out.println("IMC do paciente: " + imcCalculado);
		
		// método com retorno tipo objeto		
		IMC imc = p.calcularIndiceDeMassaCorporal2();
		
		System.out.println();
		System.out.println("TIPO DE RETORNO: OBJETO IMC");
		System.out.println("Abaixo do peso ideal: " + imc.abaixoDoPesoIdeal);
		System.out.println("Peso ideal: " + imc.pesoIdeal);
		System.out.println("Obeso: " + imc.obeso);
		System.out.println("Grau de obesidade: " + imc.grauObesidade);
	}

}
