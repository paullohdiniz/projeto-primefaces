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
	
	@Id
	@GeneratedValue
	private Long id;
	@Column (name = "cnpj", length = 60, nullable = false)
	private String cnpj;
	@Column (name = "nome_fantasia", length = 60, nullable = false)
	private String nomeFantasia;
	@Column (name = "razao_social", length = 60, nullable = false)
	private String razaoSocial;
	@Column (name = "tipo", length = 60, nullable = false)
	private String tipo;
	@Column (name = "data_fundacao")
	@Temporal(TemporalType.DATE)
	private Date dataFundacao;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Date getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
	
}
