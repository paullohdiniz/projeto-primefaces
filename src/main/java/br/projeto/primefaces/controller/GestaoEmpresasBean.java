package br.projeto.primefaces.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.projeto.primefaces.model.Empresa;
import br.projeto.primefaces.repository.Empresas;

//CDI - Inject - Ao invés de ManagerBean JSF
//ViewScoped - não usar o bean(JSF) 
@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8929493555377687928L;
	
	@Inject
	private Empresas empresas;
	
	private List<Empresa> todasEmpresas = null;
	
	
	public void consultar()
	{
		//empresas parece uma lista mas é um repositorio
		todasEmpresas = empresas.todas();
	}


	public List<Empresa> getTodasEmpresas() {
		return todasEmpresas;
	}


	public void setTodasEmpresas(List<Empresa> todasEmpresas) {
		this.todasEmpresas = todasEmpresas;
	}
	
	
}
