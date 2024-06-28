package lambda.dao;

import java.util.ArrayList;
import java.util.List;

import lambda.modelo.Fatura;

public class FaturaDAO {
	
	// acesso ao banco de dados
	public List<Fatura> buscarFaturasVencidas(){		
		// Obviamente vc buscaria isso no bando de dados...
		
		List<Fatura> faturas = new ArrayList<>();
		faturas.add(new Fatura("joao@joao.com", 350.0));
		faturas.add(new Fatura("maria@maria.com", 150.0));
		faturas.add(new Fatura("jose@jose.com", 290.0));
		
		return faturas;
		
	}

}
