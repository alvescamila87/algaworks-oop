public class CalculadoraProfessor {
	public static void main(String[] args) {
		
		float pi = 3.14f;
		
		float raio = 10.13f;
		
		float area = raio * raio * pi;
		
		int areaSemCasasDecimais = (int) area;
		
		System.out.println("Resultado: " + area);
		System.out.println("Resultado da área sem casas decimais: " + areaSemCasasDecimais);
	
	}
}