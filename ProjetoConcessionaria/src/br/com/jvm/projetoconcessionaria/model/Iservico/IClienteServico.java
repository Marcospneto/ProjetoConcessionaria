package br.com.jvm.projetoconcessionaria.model.Iservico;

import java.util.List;

import br.com.jvm.projetoconcessionaria.model.entidade.Cliente;

public interface IClienteServico {

	public boolean salvarCliente(Cliente cliente);

	public boolean deletarCliente(String documento);

	public List<Cliente> listarCliente();

	boolean alterarCliente(String documento, Cliente novoCliente);

	public boolean buscarCliente(String documento);

	public boolean buscarCliente(String documento, String name);
}
