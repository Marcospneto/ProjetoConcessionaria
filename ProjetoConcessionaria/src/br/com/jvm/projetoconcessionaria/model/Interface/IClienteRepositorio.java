package br.com.jvm.projetoconcessionaria.model.Interface;

import java.util.List;

import br.com.jvm.projetoconcessionaria.model.entidade.Cliente;

public interface IClienteRepositorio {

	public boolean salvarCliente(Cliente cliente);

	public boolean deletarCliente(String documento);

	public List<Cliente> listarCliente();

	boolean alterarCliente(String documento, Cliente novoCliente);

	boolean chegarSeDocumentoEhValido(String documento);
	
	public boolean buscarCliente(String documento);
	
	public boolean buscarCliente (String documento, String name);

}
