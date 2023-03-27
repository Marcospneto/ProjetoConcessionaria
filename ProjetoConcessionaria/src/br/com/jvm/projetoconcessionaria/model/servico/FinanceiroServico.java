package br.com.jvm.projetoconcessionaria.model.servico;

import java.util.List;

import br.com.jvm.projetoconcessionaria.model.Iservico.IFinanceiroServico;
import br.com.jvm.projetoconcessionaria.model.entidade.Financeiro;

public class FinanceiroServico implements IFinanceiroServico {

	@Override
	public boolean salvarFinanceiro(Financeiro financeiro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletarFinanceiro(float valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Financeiro> listarFinanceiro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean alterarFinanceiro(float valor, Financeiro novoFinanceiro) {
		// TODO Auto-generated method stub
		return false;
	}

}
