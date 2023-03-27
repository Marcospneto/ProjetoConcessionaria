package br.com.jvm.projetoconcessionaria.view.main;

import br.com.jvm.projetoconcessionaria.control.*;
import br.com.jvm.projetoconcessionaria.model.entidade.Cliente;
import br.com.jvm.projetoconcessionaria.model.repositorio.ClienteRepositorio;
import br.com.jvm.projetoconcessionaria.model.servico.ClienteServico;

public class teste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		String name = "Marcos";
		String documento = "12345";
		String endereco = "Rua sicrano";
		String sexo = "Masculino";
		String email = "marcos@hotmail.com";
		float renda = 10000;
		
		ClienteRepositorio repositorio = new ClienteRepositorio();
		repositorio.salvarCliente(cliente);
		repositorio.listarCliente();
		
		

	}

}
