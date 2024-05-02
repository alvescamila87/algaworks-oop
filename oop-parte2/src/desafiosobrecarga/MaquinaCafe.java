package desafiosobrecarga;

public class MaquinaCafe {
	
	int acucarDisponivel;

	// sobrecarga de métodos
	

	
	public void fazerCafe() {
		fazerCafe(10);
	}
	
	/*
	public void fazerCafe() {
	
		if(acucarDisponivel < 10) {
			System.out.println("Não há açúcar suficiente no seu café.");
		} else {
			acucarDisponivel -= 10;
			System.out.println("Fazendo cafezinho com 10 gramas de acúcar.");
		}
	}
	*/
	
	public void fazerCafe(int quantidadeAcucar) {
		if(acucarDisponivel < quantidadeAcucar){
			System.out.println("Não há açúcar suficiente para fazer o seu café.");
		} else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de acúcar.");
		}
	}

}
