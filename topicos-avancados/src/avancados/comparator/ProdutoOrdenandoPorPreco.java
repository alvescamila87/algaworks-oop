package avancados.comparator;

import java.util.Comparator;

public class ProdutoOrdenandoPorPreco implements Comparator<Produto>{

	@Override
	public int compare(Produto p1, Produto p2) {
		if(p1.getPreco() < p2.getPreco()) {
			return -1;
		} else if (p1.getPreco() > p2.getPreco()) {
			return 1;
		}
		return 0;
	}

}
