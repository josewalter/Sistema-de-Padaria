package com.br.sistemapadaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

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
	private String enderecoForncedor;
	
	@Column(name = "for_bairro", length = 35, nullable = false)
	private String bairroFornecedor;
	
	@Column(name = "for_cidade", length = 35, nullable = false)
	private String cidadeForncedor;
	
	@Column(name = "for_uf", length = 10, nullable = false)
	private String ufForncedor;
	
	@Column(name = "for_cep", length = 10, nullable = false)
	private String cepFornecedor;
	
	@Column(name = "for_cnpj", length = 14, nullable = false)
	private String cnpjForncedor;
	
	@Column(name = "for_telefone_comercial", length = 13, nullable = false)
	private String telefoneComercialFornecedor;
	
	@Column(name = "for_celular", length = 14, nullable = false)
	private String celularFornecedor;
	
	@Column(name = "for_email", length = 35, nullable = false)
	private String emailForncedor;
	/*
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_fornecedor_for_codigo", referencedColumnName = "for_codigo", nullable = false)
	private Fornecedor fornecedor;
*/
//======================================================================================================================	
	  //Construtor builder	
	public Fornecedor() {
		
	}

//======================================================================================================================	
	  //Construtor and fields	
	public Fornecedor(Long codigoFornecedor, String nomeFornecedor, String enderecoForncedor, String bairroFornecedor,
			String cidadeForncedor, String ufForncedor, String cepFornecedor, String cnpjForncedor,
			String telefoneComercialFornecedor, String celularFornecedor, String emailForncedor
			) {
		super();
		this.codigoFornecedor = codigoFornecedor;
		this.nomeFornecedor = nomeFornecedor;
		this.enderecoForncedor = enderecoForncedor;
		this.bairroFornecedor = bairroFornecedor;
		this.cidadeForncedor = cidadeForncedor;
		this.ufForncedor = ufForncedor;
		this.cepFornecedor = cepFornecedor;
		this.cnpjForncedor = cnpjForncedor;
		this.telefoneComercialFornecedor = telefoneComercialFornecedor;
		this.celularFornecedor = celularFornecedor;
		this.emailForncedor = emailForncedor;
		
	}

//======================================================================================================================	
	  //Getters and Setters		
	public long getCodigoFornecedor() {
		return codigoFornecedor;
	}

	public void setCodigoFornecedor(long codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public String getEnderecoForncedor() {
		return enderecoForncedor;
	}

	public void setEnderecoForncedor(String enderecoForncedor) {
		this.enderecoForncedor = enderecoForncedor;
	}

	public String getBairroFornecedor() {
		return bairroFornecedor;
	}

	public void setBairroFornecedor(String bairroFornecedor) {
		this.bairroFornecedor = bairroFornecedor;
	}

	public String getCidadeForncedor() {
		return cidadeForncedor;
	}

	public void setCidadeForncedor(String cidadeForncedor) {
		this.cidadeForncedor = cidadeForncedor;
	}

	public String getUfForncedor() {
		return ufForncedor;
	}

	public void setUfForncedor(String ufForncedor) {
		this.ufForncedor = ufForncedor;
	}

	public String getCepFornecedor() {
		return cepFornecedor;
	}

	public void setCepFornecedor(String cepFornecedor) {
		this.cepFornecedor = cepFornecedor;
	}

	public String getCnpjForncedor() {
		return cnpjForncedor;
	}

	public void setCnpjForncedor(String cnpjForncedor) {
		this.cnpjForncedor = cnpjForncedor;
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

	public String getEmailForncedor() {
		return emailForncedor;
	}

	public void setEmailForncedor(String emailForncedor) {
		this.emailForncedor = emailForncedor;
	}

	


}
