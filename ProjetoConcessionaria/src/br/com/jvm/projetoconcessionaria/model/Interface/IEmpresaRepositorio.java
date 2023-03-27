package br.com.jvm.projetoconcessionaria.model.Interface;

import java.util.List;

import br.com.jvm.projetoconcessionaria.model.entidade.Empresa;

public interface IEmpresaRepositorio {

	public boolean salvarEmpresa(Empresa empresa);
	
	public List<Empresa> listarEmpresa();

}
