package br.com.jvm.projetoconcessionaria.model.Iservico;

import java.util.List;

import br.com.jvm.projetoconcessionaria.model.entidade.Empresa;

public interface IEmpresaServico {
	
	public boolean salvarEmpresa(Empresa empresa);

	public List<Empresa> listarEmpresa();

}
