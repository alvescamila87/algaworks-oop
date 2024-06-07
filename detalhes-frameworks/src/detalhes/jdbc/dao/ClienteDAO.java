package detalhes.jdbc.dao;

import java.util.List;

import detalhes.jdbc.modelo.Cliente;

public interface ClienteDAO {
	
	public void salvar(Cliente cliente);

	public Cliente buscarPeloCodigo(Long codigo);

	public List<Cliente> buscarTodos();

}
