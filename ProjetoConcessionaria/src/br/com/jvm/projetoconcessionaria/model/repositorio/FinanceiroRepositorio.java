package br.com.jvm.projetoconcessionaria.model.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.com.jvm.projetoconcessionaria.model.Interface.IFinanceiroRepositorio;
import br.com.jvm.projetoconcessionaria.model.entidade.Financeiro;

public class FinanceiroRepositorio implements IFinanceiroRepositorio {

	List<Financeiro> listaFinanceiro = new ArrayList<Financeiro>();
	
	@Override
	public boolean salvarFinanceiro(Financeiro financeiro) {
		try {
			listaFinanceiro.add(financeiro);
			System.out.println("Salvo com sucesso");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public boolean deletarFinanceiro(float valor) {
		for (Financeiro financeiro : listaFinanceiro) {
			if (financeiro.getValor() == valor) {
				listaFinanceiro.remove(financeiro);
			}
		}
		
		return false;
	}

	@Override
	public List<Financeiro> listarFinanceiro() {
		
		return listaFinanceiro;
	}

	@Override
	public boolean alterarFinanceiro(float valor, Financeiro novoFinanceiro) {
		for (int i=0; i < listaFinanceiro.size(); i++) {
			Financeiro financeiro = listaFinanceiro.get(i);
			if (financeiro.getValor() == valor) {
				listaFinanceiro.set(i, novoFinanceiro);
				return true;
			}
			
		}
		return false;
	}

}
