package br.com.jvm.projetoconcessionaria.model.servico;

import java.util.List;

import br.com.jvm.projetoconcessionaria.model.Iservico.IVendaServico;
import br.com.jvm.projetoconcessionaria.model.entidade.Venda;

public class VendaServico implements IVendaServico {

	@Override
	public boolean salvarVenda(Venda venda) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletarVenda(String nomeCliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Venda> listarVenda() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean alterarVenda(String nomeCliente, Venda novaVenda) {
		// TODO Auto-generated method stub
		return false;
	}

}
