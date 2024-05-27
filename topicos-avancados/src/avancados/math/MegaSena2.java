package avancados.math;

import java.util.ArrayList;

public class MegaSena2 {
	
	final static int QUANTIDADE_NUMEROS_MEGA = 6;
	
	private ArrayList<Integer> guardarNumero = new ArrayList<>();
	
	private ArrayList<Integer> deletarNumeroRepetido = new ArrayList<>();
	
	private int numerosAleatorios;
	
	void listarJogos() {
		
		deletarNumeroRepetido.clear();
		guardarNumero.clear();
		
		while(deletarNumeroRepetido.size() < QUANTIDADE_NUMEROS_MEGA) {
			
			numerosAleatorios = (int) (Math.round(Math.random() * 59) + 01);
			
			if(deletarNumeroRepetido.contains(numerosAleatorios) == false) {			
				deletarNumeroRepetido.add((int) numerosAleatorios);
				guardarNumero.add((int) numerosAleatorios);
			}
		}
		System.out.println(" " + deletarNumeroRepetido);
		
	}
	
	

}
