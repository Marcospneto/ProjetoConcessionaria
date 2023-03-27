package br.com.jvm.projetoconcessionaria.model.repositorio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.jvm.projetoconcessionaria.model.Interface.IClienteRepositorio;
import br.com.jvm.projetoconcessionaria.model.entidade.Cliente;

public class ClienteRepositorio implements IClienteRepositorio {

	private ArrayList<Cliente> listaCliente;

	public ClienteRepositorio() {
		this.listaCliente = new ArrayList<Cliente>();
	}

	@Override
	public boolean salvarCliente(Cliente cliente) {

		try {
			listaCliente.add(cliente);
			System.out.println("Salvo com sucesso !");
		} catch (Exception e) {
			return false;
		}
		return true;

	}

	@Override
	public boolean deletarCliente(String documento) {
		Iterator<Cliente> iterator = listaCliente.iterator();

		while (iterator.hasNext()) {
			Cliente cliente = iterator.next();
			if (cliente.getDocumento().equals(documento)) {
				iterator.remove();
				System.out.println("Cliente Removido");
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Cliente> listarCliente() {

		return this.listaCliente;

	}

	@Override
	public boolean alterarCliente(String documento, Cliente novoCliente) {
		for (int i = 0; i < listaCliente.size(); i++) {
			Cliente cliente = listaCliente.get(i);
			if (cliente != null && cliente.getDocumento().equals(documento)) {
				listaCliente.set(i, novoCliente);

				System.out.println("Cliente Alterado com Sucesso");
				return true;

			}
		}
		return false;
	}

	@Override

	public boolean chegarSeDocumentoEhValido(String documento) {
		// TODO Auto-generated method stub
		return false;
	}

	// Sobrecarga de Metodo
	@Override

	public boolean buscarCliente(String documento) {
		for (Cliente cliente : listaCliente) {
			if (cliente.getDocumento().equals(documento)) {
				System.out.println(cliente.toString());
				return true;
			}

		}

		return false;
	}	

	@Override
	public boolean buscarCliente(String documento, String name) {
		for (Cliente cliente : listaCliente) {
			if (cliente.getDocumento().equals(documento) && cliente.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
}
