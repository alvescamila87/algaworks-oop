package wrappers;

public class TesteTelevisor {
	
	Integer canal = 130;
	Integer volume = 20;
	
	void mudarCanal(Integer novoCanal) {
		//System.out.println("Canal escolhido: " + novoCanal);
		if (canal.equals(novoCanal)) {
			System.out.println("Novo canal é também o canal atual.");
		} else {
			canal = novoCanal;
			System.out.println("Canal alterado para " + canal);
		}
	}
	
	void mudarVolume(Integer novoVolume) {
		//System.out.println("Volume escolhido: " + novoVolume);
		if (novoVolume.equals(volume)) {
			System.out.println("Novo volume é também o volume atual.");
		} else {
			volume = new Integer(novoVolume.byteValue());
			System.out.println("Volume alterado para " + volume);
		}
	}
	
	// Estamos aproveitando a classe Televisor para fazer nosso teste
	public static void main(String[] args) {
		TesteTelevisor tv = new TesteTelevisor();

		// Não deveria mudar o volume e canal
		tv.mudarVolume(20);
		tv.mudarCanal(130);
		
		// Deveria mudar o volume e canal
		tv.mudarVolume(300);
		tv.mudarCanal(10);
	}

}
