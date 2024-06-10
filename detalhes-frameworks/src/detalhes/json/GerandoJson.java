package detalhes.json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import detalhes.json.modelo.Cliente;
import detalhes.json.modelo.Endereco;
import detalhes.json.modelo.Telefone;

public class GerandoJson {
	
	public static void main(String[] args) {
		
		// Criando endereço
		Endereco endereco = new Endereco("Rua Zielisnk, 10", "Pomerode", "SC");		
		
		// Criando telefone
		Telefone residencial = new Telefone("RESIDENCIAL", "47 99999-5555");
		Telefone comercial = new Telefone("COMERCIAL", "47 99999-4444");
		List<Telefone> telefones = new ArrayList<>();
		telefones.add(residencial);
		telefones.add(comercial);
		
		// Criando cliente
		Cliente cliente = new Cliente("Rudolf Zimmermann", 30, endereco, telefones);
		
		// Gerar Json
		Gson gson = new Gson();
		String json = gson.toJson(cliente);
		
		System.out.println(json);
		
		// Processo inverso 
		
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println();
		
		Cliente c2 = gson.fromJson(json, Cliente.class);
		
		System.out.println(c2.getNome());
		System.out.println(c2.getIdade());
		System.out.println(c2.getEndereco().getRua());
		System.out.println(c2.getEndereco().getCidade());
		System.out.println(c2.getEndereco().getEstado());
		System.out.println(c2.getTelefones().get(0).getNumero());
		System.out.println(c2.getTelefones().get(1).getNumero());
				
	}

}
