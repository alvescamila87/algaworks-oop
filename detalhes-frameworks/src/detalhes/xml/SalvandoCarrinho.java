package detalhes.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.XStream;

import detalhes.xml.modelo.Produto;

public class SalvandoCarrinho {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// Criar lista de produtos
		List<Produto> carrinho = new ArrayList<>();
		carrinho.add(new Produto(1L, "sabonete", new BigDecimal("2.30")));
		carrinho.add(new Produto(2L, "shampoo", new BigDecimal("8.90")));
		
		// Salvar a lista do carrinho em XML
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("produto", Produto.class);
		xstream.aliasAttribute(Produto.class, "codigo", "codigo");
		xstream.alias("carrinho", List.class);
		
		// Gerar saída
		FileOutputStream os = new FileOutputStream("./carrinho.xml");
		xstream.toXML(carrinho, os);
	}	

}
