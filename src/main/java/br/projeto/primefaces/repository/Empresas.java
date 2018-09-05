package br.projeto.primefaces.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.projeto.primefaces.model.Empresa;

@Named
@ViewScoped
public class Empresas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1154692528370034465L;
	
	//@Inject
	private EntityManager manager;
	
	public Empresa byId(Long id){
		
//		return manager.find(Empresa.class, id);
		return new Empresa();
	}
	
	public List<Empresa> todas()
	{
//		return manager.createQuery("from Empresa", Empresa.class).getResultList();
		return new ArrayList<Empresa>();
	}

}
