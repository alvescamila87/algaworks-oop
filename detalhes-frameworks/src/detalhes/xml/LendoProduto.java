package detalhes.xml;

import java.io.FileNotFoundException;
import java.io.FileInputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

import detalhes.xml.modelo.Produto;

public class LendoProduto {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// Mapeamento 
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("produto", Produto.class);
		xstream.aliasAttribute(Produto.class, "codigo", "codigo");
		
		// Permitir todas as classes (não recomendado para produção)
		xstream.addPermission(AnyTypePermission.ANY);
		
		// Pega do XML e transforma no objeto da classe
		Produto p = (Produto) xstream.fromXML(new FileInputStream("./produto2.xml"));
		
		// Mostrar o que está lendo
		System.out.println(p.getCodigo());
		System.out.println(p.getDescricao());
		System.out.println(p.getValor());
	}

}
