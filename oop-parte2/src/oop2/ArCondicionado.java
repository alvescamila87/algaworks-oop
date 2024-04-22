package oop2;

public class ArCondicionado {
	
	private int temperatura;
	
	public void alterarTemperatura(int temperatura) {
		if(temperatura >= 17 && temperatura <= 25) {
			this.temperatura = temperatura;
		}
	}
	
	public int obterTemperatura() {
		//alterarTemperatura(21);
		return temperatura;
	}


}
