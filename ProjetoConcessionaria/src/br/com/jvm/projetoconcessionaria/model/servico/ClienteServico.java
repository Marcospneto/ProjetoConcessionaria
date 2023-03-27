package br.com.jvm.projetoconcessionaria.model.servico;

import java.util.List;

import br.com.jvm.projetoconcessionaria.model.Iservico.IClienteServico;
import br.com.jvm.projetoconcessionaria.model.entidade.Cliente;

import br.com.jvm.projetoconcessionaria.model.repositorio.*;
import br.com.jvm.projetoconcessionaria.view.main.Main;

public class ClienteServico extends Main implements IClienteServico {

	private ClienteRepositorio clienterepo;

	public ClienteServico() {
		this.clienterepo = new ClienteRepositorio();

	}

	@Override
	public boolean salvarCliente(Cliente cliente) {

		if (cliente == null || cliente.getName() == null || cliente.getName().isEmpty()
				|| cliente.getDocumento() == null || !checarSeDocumentoEhValido(cliente.getDocumento())
				|| cliente.getDocumento().isEmpty() || cliente.getEndereco() == null || cliente.getEndereco().isEmpty()
				|| cliente.getEmail() == null || !cliente.getEmail().contains("@") || cliente.getEmail().isEmpty()
				|| cliente.getSexo() == null || cliente.getSexo().isEmpty()) {
			System.out.println("********************************[ERRO]*********************************");
			System.out.println("********* CAMPO OBRIGATORIO, PREENCHA OS DADOS CORRETAMENTE ***********");

		} else {
			this.clienterepo.salvarCliente(cliente);

			return true;
		}
		return true;

	}

	@Override
	public boolean deletarCliente(String documento) {

		List<Cliente> listaCliente = this.clienterepo.listarCliente();

		for (Cliente cliente : listaCliente) {
			if (documento != null && documento.equals(cliente.getDocumento())) {
				System.out.println(cliente.toString());
				this.clienterepo.deletarCliente(documento);
				return true;

			}
		}
		System.out.println("********************************[ERRO]*********************************");
		System.out.println("*                      Cliente não Encontrado                         *");
		return false;
	}

	@Override
	public List<Cliente> listarCliente() {
		List<Cliente> listaCliente = this.clienterepo.listarCliente();
		if (listaCliente.isEmpty()) {
			System.out.println("A lista está vazia ! ");
		} else {
			System.out.println("Lista de Clientes:");
			for (Cliente cliente : listaCliente) {

				System.out.println(cliente);

			}

		}
		return listaCliente;

	}

	@Override
	public boolean alterarCliente(String documento, Cliente novoCliente) {
		List<Cliente> listaCliente = this.clienterepo.listarCliente(); 
		Cliente clienteAntigo = null;
		for (Cliente cliente : listaCliente) {
			if (cliente.getDocumento().equals(documento)) {
				clienteAntigo = cliente;
				break;
			}
		}

		if (clienteAntigo == null) {
			System.out.println("[ERRO] CLIENTE NÃO ENCONTRADO");
			return false;
		}
		if (!checarSeDocumentoEhValido(novoCliente.getDocumento())) {
			System.out.println("[ERRO]- DOCUMENTO INVÁLIDO");
			return false;
		}
		/*if (!salvarCliente(novoCliente)) {
			System.out.println("[ERRO]- INFORMAÇÕES DO CLIENTE INVÁLIDAS");
			return false;
		}*/
		if (!buscarCliente(novoCliente.getDocumento())) {
			System.out.println("NÃO HÁ CLIENTE CADASTRADO COM ESSE DOCUMENTO");

		} else {
			clienteAntigo.setName(novoCliente.getName());
			clienteAntigo.setDocumento(novoCliente.getDocumento());
			clienteAntigo.setEndereco(novoCliente.getEndereco());
			clienteAntigo.setEmail(novoCliente.getEmail());
			clienteAntigo.setSexo(novoCliente.getSexo());
			clienteAntigo.setRenda(novoCliente.getRenda());
			this.clienterepo.alterarCliente(documento, clienteAntigo);
			
			return true;
		}
		return true;
	}

	public boolean checarSeDocumentoEhValido(String documento) {

		boolean valido = true;
		if (documento.length() != 11) {
			System.out.println("[ERRO]- CPF DEVE CONTER 11 DIGITOS, SEM ESPAÇOES E PONTO");
			valido = false;
		} else {
			for (int i = 0; i < documento.length(); i++) {
				if (!Character.isDigit(documento.charAt(i))) {
					System.out.println("[ERRO]- CPF DEVE CONTER APENAS NUMEROS");
					valido = false;
					break;
				}
			}
		}
		return valido;
	}
	// SOBRECARGA DE METODOS
	@Override
	public boolean buscarCliente(String documento) {

		return this.clienterepo.buscarCliente(documento);

	}

	@Override
	public boolean buscarCliente(String documento, String name) {

		return this.clienterepo.buscarCliente(documento, name);
	}



}
