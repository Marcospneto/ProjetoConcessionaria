package br.com.jvm.projetoconcessionaria.model.Interface;

import java.util.List;

import br.com.jvm.projetoconcessionaria.model.entidade.Veiculo;

public interface IVeiculoRepositorio {

	public boolean salvarVeiculo(Veiculo veiculo);

	boolean deletarVeiculo(String modelo);

	public List<Veiculo> listarVeiculo();

	public boolean alterarVeiculo(String modelo, Veiculo novoVeiculo);

	public boolean buscarVeiculo(String modelo);

}
