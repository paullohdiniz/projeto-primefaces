package br.projeto.primefaces.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Empresa")
public class Empresa implements Serializable{
	
	
	private Long id;
	private String cnpj;
	private String nome_fantasia;
	private String razao_social;
	private String tipo;
	private Date data_fundacao;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column (name = "cnpj", length = 60, nullable = false)
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	@Column (name = "nome_fantasia", length = 60, nullable = false)
	public String getNome_fantasia() {
		return nome_fantasia;
	}
	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}
	@Column (name = "razao_social", length = 60, nullable = false)
	public String getRazao_social() {
		return razao_social;
	}
	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}
	@Column (name = "tipo", length = 60, nullable = false)
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Column (name = "data_fundacao")
	@Temporal(TemporalType.DATE)
	public Date getData_fundacao() {
		return data_fundacao;
	}
	public void setData_fundacao(Date data_fundacao) {
		this.data_fundacao = data_fundacao;
	}
	
	
}
