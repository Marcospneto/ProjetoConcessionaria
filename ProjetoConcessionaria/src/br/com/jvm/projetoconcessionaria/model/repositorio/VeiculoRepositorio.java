package br.com.jvm.projetoconcessionaria.model.repositorio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.jvm.projetoconcessionaria.model.Interface.IVeiculoRepositorio;
import br.com.jvm.projetoconcessionaria.model.entidade.Veiculo;

public class VeiculoRepositorio implements IVeiculoRepositorio {

	private ArrayList<Veiculo> listaVeiculo;

	public VeiculoRepositorio() {
		this.listaVeiculo = new ArrayList<Veiculo>();
	}

	@Override
	public boolean salvarVeiculo(Veiculo veiculo) {
		try {
			listaVeiculo.add(veiculo);
			System.out.println("Salvo com Sucesso !");
		} catch (Exception e) {
			return false;
		}
		return true;

	}

	@Override
	public boolean deletarVeiculo(String modelo) {
		Iterator<Veiculo> iterator = listaVeiculo.iterator();

		while (iterator.hasNext()) {
			Veiculo veiculo = iterator.next();
			if (veiculo.getModelo().equals(modelo)) {
				iterator.remove();
				System.out.println("Veiculo Removido");
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Veiculo> listarVeiculo() {

		return this.listaVeiculo;
	}

	@Override
	public boolean alterarVeiculo(String modelo, Veiculo novoVeiculo) {
		for (int i = 0; i < listaVeiculo.size(); i++) {
			Veiculo veiculo = listaVeiculo.get(i);
			if (veiculo != null && veiculo.getModelo().equals(modelo)) {
				listaVeiculo.set(i, novoVeiculo);
				System.out.println("Veiculo Alterado com Sucesso");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean buscarVeiculo(String modelo) {
		for (Veiculo veiculo : listaVeiculo) {
			if (veiculo.getModelo().equals(modelo)) {
				System.out.println(veiculo.toString());
				return true;
			}
		}
		return false;
	}

}
