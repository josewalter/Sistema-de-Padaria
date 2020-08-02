package com.br.sistemapadaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

/*
 * Titulo: Entidade Fornecedor
 * Descrição: Criação da entidade fornecedor
 * Data: 08/12/2019  13:17
 * Autor: José Walter
 */

@Entity
@Table(name="tbl_fornecedor")
public class Fornecedor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "for_codigo")
	private Long codigoFornecedor;
	
	@Column(name = "for_nome", length = 35, nullable = false)
	private String nomeFornecedor;
	
	@Column(name = "for_endereco", length = 35, nullable = false)
	private String enderecoFornecedor;
	
	@Column(name = "for_bairro", length = 35, nullable = false)
	private String bairroFornecedor;
	
	@Column(name = "for_cidade", length = 35, nullable = false)
	private String cidadeFornecedor;
	
	@Column(name = "for_uf", length = 10, nullable = false)
	private String ufFornecedor;
	
	@Column(name = "for_cep", length = 10, nullable = false)
	private String cepFornecedor;
	
	@Column(name = "for_cnpj", length = 14, nullable = false)
	private String cnpjFornecedor;
	
	@Column(name = "for_telefone_comercial", length = 13, nullable = false)
	private String telefoneComercialFornecedor;
	
	@Column(name = "for_celular", length = 14, nullable = false)
	private String celularFornecedor;
	
	@Column(name = "for_email", length = 35, nullable = false)
	private String emailFornecedor;

	public Fornecedor() {
		
	}

	public Fornecedor(Long codigoFornecedor, String nomeFornecedor, String enderecoFornecedor, String bairroFornecedor,
			String cidadeFornecedor, String ufFornecedor, String cepFornecedor, String cnpjFornecedor,
			String telefoneComercialFornecedor, String celularFornecedor, String emailFornecedor) {
		super();
		this.codigoFornecedor = codigoFornecedor;
		this.nomeFornecedor = nomeFornecedor;
		this.enderecoFornecedor = enderecoFornecedor;
		this.bairroFornecedor = bairroFornecedor;
		this.cidadeFornecedor = cidadeFornecedor;
		this.ufFornecedor = ufFornecedor;
		this.cepFornecedor = cepFornecedor;
		this.cnpjFornecedor = cnpjFornecedor;
		this.telefoneComercialFornecedor = telefoneComercialFornecedor;
		this.celularFornecedor = celularFornecedor;
		this.emailFornecedor = emailFornecedor;
	}

	public Long getCodigoFornecedor() {
		return codigoFornecedor;
	}

	public void setCodigoFornecedor(Long codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public String getEnderecoFornecedor() {
		return enderecoFornecedor;
	}

	public void setEnderecoFornecedor(String enderecoFornecedor) {
		this.enderecoFornecedor = enderecoFornecedor;
	}

	public String getBairroFornecedor() {
		return bairroFornecedor;
	}

	public void setBairroFornecedor(String bairroFornecedor) {
		this.bairroFornecedor = bairroFornecedor;
	}

	public String getCidadeFornecedor() {
		return cidadeFornecedor;
	}

	public void setCidadeFornecedor(String cidadeFornecedor) {
		this.cidadeFornecedor = cidadeFornecedor;
	}

	public String getUfFornecedor() {
		return ufFornecedor;
	}

	public void setUfFornecedor(String ufFornecedor) {
		this.ufFornecedor = ufFornecedor;
	}

	public String getCepFornecedor() {
		return cepFornecedor;
	}

	public void setCepFornecedor(String cepFornecedor) {
		this.cepFornecedor = cepFornecedor;
	}

	public String getCnpjFornecedor() {
		return cnpjFornecedor;
	}

	public void setCnpjFornecedor(String cnpjFornecedor) {
		this.cnpjFornecedor = cnpjFornecedor;
	}

	public String getTelefoneComercialFornecedor() {
		return telefoneComercialFornecedor;
	}

	public void setTelefoneComercialFornecedor(String telefoneComercialFornecedor) {
		this.telefoneComercialFornecedor = telefoneComercialFornecedor;
	}

	public String getCelularFornecedor() {
		return celularFornecedor;
	}

	public void setCelularFornecedor(String celularFornecedor) {
		this.celularFornecedor = celularFornecedor;
	}

	public String getEmailFornecedor() {
		return emailFornecedor;
	}

	public void setEmailFornecedor(String emailFornecedor) {
		this.emailFornecedor = emailFornecedor;
	}

	@Override
	public String toString() {
		return "Fornecedor [codigoFornecedor=" + codigoFornecedor + ", nomeFornecedor=" + nomeFornecedor
				+ ", enderecoFornecedor=" + enderecoFornecedor + ", bairroFornecedor=" + bairroFornecedor
				+ ", cidadeFornecedor=" + cidadeFornecedor + ", ufFornecedor=" + ufFornecedor + ", cepFornecedor="
				+ cepFornecedor + ", cnpjFornecedor=" + cnpjFornecedor + ", telefoneComercialFornecedor="
				+ telefoneComercialFornecedor + ", celularFornecedor=" + celularFornecedor + ", emailFornecedor="
				+ emailFornecedor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairroFornecedor == null) ? 0 : bairroFornecedor.hashCode());
		result = prime * result + ((celularFornecedor == null) ? 0 : celularFornecedor.hashCode());
		result = prime * result + ((cepFornecedor == null) ? 0 : cepFornecedor.hashCode());
		result = prime * result + ((cidadeFornecedor == null) ? 0 : cidadeFornecedor.hashCode());
		result = prime * result + ((cnpjFornecedor == null) ? 0 : cnpjFornecedor.hashCode());
		result = prime * result + ((codigoFornecedor == null) ? 0 : codigoFornecedor.hashCode());
		result = prime * result + ((emailFornecedor == null) ? 0 : emailFornecedor.hashCode());
		result = prime * result + ((enderecoFornecedor == null) ? 0 : enderecoFornecedor.hashCode());
		result = prime * result + ((nomeFornecedor == null) ? 0 : nomeFornecedor.hashCode());
		result = prime * result + ((telefoneComercialFornecedor == null) ? 0 : telefoneComercialFornecedor.hashCode());
		result = prime * result + ((ufFornecedor == null) ? 0 : ufFornecedor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		if (bairroFornecedor == null) {
			if (other.bairroFornecedor != null)
				return false;
		} else if (!bairroFornecedor.equals(other.bairroFornecedor))
			return false;
		if (celularFornecedor == null) {
			if (other.celularFornecedor != null)
				return false;
		} else if (!celularFornecedor.equals(other.celularFornecedor))
			return false;
		if (cepFornecedor == null) {
			if (other.cepFornecedor != null)
				return false;
		} else if (!cepFornecedor.equals(other.cepFornecedor))
			return false;
		if (cidadeFornecedor == null) {
			if (other.cidadeFornecedor != null)
				return false;
		} else if (!cidadeFornecedor.equals(other.cidadeFornecedor))
			return false;
		if (cnpjFornecedor == null) {
			if (other.cnpjFornecedor != null)
				return false;
		} else if (!cnpjFornecedor.equals(other.cnpjFornecedor))
			return false;
		if (codigoFornecedor == null) {
			if (other.codigoFornecedor != null)
				return false;
		} else if (!codigoFornecedor.equals(other.codigoFornecedor))
			return false;
		if (emailFornecedor == null) {
			if (other.emailFornecedor != null)
				return false;
		} else if (!emailFornecedor.equals(other.emailFornecedor))
			return false;
		if (enderecoFornecedor == null) {
			if (other.enderecoFornecedor != null)
				return false;
		} else if (!enderecoFornecedor.equals(other.enderecoFornecedor))
			return false;
		if (nomeFornecedor == null) {
			if (other.nomeFornecedor != null)
				return false;
		} else if (!nomeFornecedor.equals(other.nomeFornecedor))
			return false;
		if (telefoneComercialFornecedor == null) {
			if (other.telefoneComercialFornecedor != null)
				return false;
		} else if (!telefoneComercialFornecedor.equals(other.telefoneComercialFornecedor))
			return false;
		if (ufFornecedor == null) {
			if (other.ufFornecedor != null)
				return false;
		} else if (!ufFornecedor.equals(other.ufFornecedor))
			return false;
		return true;
	}
	
   
}
