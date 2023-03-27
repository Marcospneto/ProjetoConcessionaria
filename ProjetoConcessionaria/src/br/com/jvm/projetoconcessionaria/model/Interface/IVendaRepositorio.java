package br.com.jvm.projetoconcessionaria.model.Interface;

import java.util.List;

import br.com.jvm.projetoconcessionaria.model.entidade.Venda;

public interface IVendaRepositorio {

	public boolean salvarVenda(Venda venda);

	public boolean deletarVenda(String nomeCliente);

	public List<Venda> listarVenda();

	public boolean alterarVenda(String nomeCliente, Venda novaVenda);
}
