package detalhes.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import detalhes.xml.modelo.Produto;

public class SalvandoProduto {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// Mapeamento
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("produto", Produto.class);
		xstream.aliasAttribute(Produto.class, "codigo", "codigo");
		
		Produto sabonete = new Produto(1L, "sabonete", new BigDecimal("2.30"));
		
		// Gera arquivo XML
		String xml = xstream.toXML(sabonete);
		System.out.println(xml);
		
		// Transformar isso em arquivo
		FileOutputStream os = new FileOutputStream("./produto1.xml");
		xstream.toXML(sabonete, os);
	}

}
