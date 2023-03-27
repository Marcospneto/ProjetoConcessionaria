package br.com.jvm.projetoconcessionaria.model.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.com.jvm.projetoconcessionaria.model.Interface.IEmpresaRepositorio;
import br.com.jvm.projetoconcessionaria.model.entidade.Empresa;

public class EmpresaRepositorio implements IEmpresaRepositorio {

	List<Empresa> listaEmpresa = new ArrayList<Empresa>();

	@Override
	public boolean salvarEmpresa(Empresa empresa) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public List<Empresa> listarEmpresa() {

		return listaEmpresa;
	}

	

}
