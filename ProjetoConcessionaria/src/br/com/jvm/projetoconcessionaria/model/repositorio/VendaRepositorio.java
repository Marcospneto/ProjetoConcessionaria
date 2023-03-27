package br.com.jvm.projetoconcessionaria.model.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.com.jvm.projetoconcessionaria.model.Interface.IVendaRepositorio;
import br.com.jvm.projetoconcessionaria.model.entidade.Venda;

public class VendaRepositorio implements IVendaRepositorio {

	List<Venda> listaVenda = new ArrayList<Venda>();

	@Override
	public boolean salvarVenda(Venda venda) {
		try {
			listaVenda.add(venda);
			System.out.println("Venda Salva");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public boolean deletarVenda(String nomeCliente) {
		for (Venda venda : listaVenda) {
			if (venda.getCliente().equals(nomeCliente)) {
				listaVenda.remove(venda);
			}
		}
		return false;
	}

	@Override
	public List<Venda> listarVenda() {
		return listaVenda;

	}

	@Override
	public boolean alterarVenda(String nomeCliente, Venda novaVenda) {
		for (int i = 0; i < listaVenda.size(); i++) {
			Venda venda = listaVenda.get(i);
			if (venda.getCliente().equals(nomeCliente)) {
				listaVenda.set(i, novaVenda);
				return true;
			}
		}
		return false;
	}

}
