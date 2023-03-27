package br.com.jvm.projetoconcessionaria.model.servico;

import java.util.List;

import br.com.jvm.projetoconcessionaria.model.Iservico.IVeiculoServico;
import br.com.jvm.projetoconcessionaria.model.entidade.Veiculo;
import br.com.jvm.projetoconcessionaria.model.repositorio.VeiculoRepositorio;

public class VeiculoServico implements IVeiculoServico {
	private VeiculoRepositorio veiculorepo;

	public VeiculoServico() {
		this.veiculorepo = new VeiculoRepositorio();
	}

	@Override
	public boolean salvarVeiculo(Veiculo veiculo) {
		if (veiculo == null || veiculo.getMarca() == null || veiculo.getMarca().isEmpty() || veiculo.getModelo() == null
				|| veiculo.getModelo().isEmpty() || veiculo.getAno() == null || veiculo.getAno().isEmpty()
				|| veiculo.getCor() == null || veiculo.getCor().isEmpty()) {
			System.out.println("********************************[ERRO]*********************************");
			System.out.println("********* CAMPO OBRIGATORIO, PREENCHA OS DADOS CORRETAMENTE ***********");

		} else {
			this.veiculorepo.salvarVeiculo(veiculo);
		}
		return true;

	}

	@Override
	public boolean deletarVeiculo(String modelo) {
		List<Veiculo> listaVeiculo = this.veiculorepo.listarVeiculo();

		for (Veiculo veiculo : listaVeiculo) {
			if (modelo != null && modelo.equals(veiculo.getModelo())) {
				System.out.println(veiculo.toString());
				this.veiculorepo.deletarVeiculo(modelo);
				return true;

			}
		}
		System.out.println("********************************[ERRO]*********************************");
		System.out.println("*                      Veiculo não Encontrado                         *");
		return false;
	}

	@Override
	public List<Veiculo> listarVeiculo() {

		List<Veiculo> listaVeiculo = this.veiculorepo.listarVeiculo();
		if (listaVeiculo.isEmpty()) {
			System.out.println("A lista está vazia ! ");
		} else {
			System.out.println("Lista de Veiculos:");
			for (Veiculo veiculo : listaVeiculo) {

				System.out.println(veiculo);

			}

		}
		return listaVeiculo;

	}

	@Override
	public boolean alterarVeiculo(String modelo, Veiculo novoVeiculo) {
		List<Veiculo> listaVeiculo = this.veiculorepo.listarVeiculo();
		Veiculo antigoVeiculo = null;
		for (Veiculo veiculo : listaVeiculo) {
			if (veiculo.getModelo().equals(modelo)) {
				antigoVeiculo = veiculo;
				break;
			}
		}
		if (antigoVeiculo == null) {
			System.out.println("[ERRO] VEICULO NÃO ENCONTRADO");
		}

		if (!buscarVeiculo(novoVeiculo.getModelo())) {
			System.out.println("[ERRO] NÃO HÁ VEICULO CADASTRADO COM ESSE MODELO");
		} else {
			antigoVeiculo.setMarca(novoVeiculo.getMarca());
			antigoVeiculo.setModelo(novoVeiculo.getModelo());
			antigoVeiculo.setCor(novoVeiculo.getCor());
			antigoVeiculo.setAno(novoVeiculo.getAno());
			antigoVeiculo.setValor(novoVeiculo.getValor());
			this.veiculorepo.alterarVeiculo(modelo, antigoVeiculo);
			return true;
		}

		return true;
	}

	@Override
	public boolean buscarVeiculo(String modelo) {
		return this.veiculorepo.buscarVeiculo(modelo);

	}

}
