package br.com.jvm.projetoconcessionaria.model.Iservico;

import java.util.List;

import br.com.jvm.projetoconcessionaria.model.entidade.Financeiro;

public interface IFinanceiroServico {
	
	public boolean salvarFinanceiro(Financeiro financeiro);

	public boolean deletarFinanceiro(float valor);

	public List<Financeiro> listarFinanceiro();

	public boolean alterarFinanceiro(float valor, Financeiro novoFinanceiro);

}


