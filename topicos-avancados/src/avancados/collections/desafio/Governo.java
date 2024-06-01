package avancados.collections.desafio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * A classe Governo organiza os políticos e seus partidos e calcula os gastos totais dos salários.
 */
public class Governo {
	
	// Armazena uma lista de políticos por estado da federação
	private Map<String, List<Politico>> partidosPoliticos ;
	
	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}
	
	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		
		// Recupera a lista de políticos para um partido
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		// Se não existir uma lista de políticos para um partido informado,
		// devemos instanciar uma nova lista (pois é a primeira inclusão neste partido)
		if(politicos == null) {
			politicos = new ArrayList<Politico>();
		}
		
		// Adiciona o político recebido como parâmetro à lista de políticos
		politicos.add(politico);
		
		// Adiciona a lista de políticos ao mapa de partidos usando
		// como chave o nome do partido
		this.partidosPoliticos.put(partidoPolitico, politicos);
	}
	
	public BigDecimal calcularGastosComSalario(String partidoPolitico) {
		// implementar busca de políticos para o partido informado
		// e cálculo dos salários
		
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		BigDecimal custoComSalarioPorPartido = new BigDecimal(0.0);
		
		if(politicos != null) {
			for (Politico p : politicos) {
				custoComSalarioPorPartido = custoComSalarioPorPartido.add(p.getCargo().getSalario());
			}
		}
		return custoComSalarioPorPartido;
	}
	
	public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
		// implementar busca dos políticos para o partido e cargo informados
		// e cálculo dos salários
		
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		BigDecimal custoComSalarioPorCargo = new BigDecimal(0.0);
		
		if(politicos != null) {
			for(Politico p : politicos) {
				if(p.getCargo().equals(cargo)) {
					custoComSalarioPorCargo = custoComSalarioPorCargo.add(p.getCargo().getSalario());
				}
						
			}		
		}		
		return custoComSalarioPorCargo;
	}

}
