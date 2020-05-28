package com.br.sistemapadaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/*
 * Descrição: Entidade cliente
 * Data: 08/12/2019  13:17
 * Autor: José Walter
 */

@Entity
@Table(name="tbl_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "cli_codigo")
	private Long codigoCliente;
	
	@NotBlank(message="Por favor preencha o campo nome do cliente")
	@Column(name = "cli_nome", length = 35, nullable = false)
	private String nomeCliente;
	
	@NotBlank(message="Por favor preencha o campo endereço")
	@Column(name = "cli_endereco", length = 35, nullable = false)
	private String enderecoCliente;
	
	@NotBlank(message="Por favor preencha o campo bairro")
	@Column(name = "cli_bairro", length = 35, nullable = false)
	private String bairroCliente;
	
	@NotBlank(message="Por favor preencha o campo cidade")
	@Column(name = "cli_cidade", length = 35, nullable = false)
	private String cidadeCliente;
	
	@NotBlank(message="Por favor preencha o campo Estado")
	@Column(name = "cli_uf", length = 25, nullable = false)
	private String ufCliente;
	
	@NotBlank(message="Por favor preencha o campo cep")
	@Column(name = "cli_cep", length = 10, nullable = false)
	private String cepCliente;
	
	@NotBlank(message="Por favor preencha o campo cpf")
	@Column(name = "cli_cpf", length = 15, nullable = false)
	private String cpfCliente;
	
	@NotBlank(message="Por favor preencha o campo telefone")
	@Column(name = "cli_telefone_residencial", length = 13, nullable = false)
	private String telefoneResidencialCliente;
	
	@NotBlank(message="Por favor preencha o campo celular")
	@Column(name = "cli_celular", length = 14, nullable = false)
	private String celularCliente;
	
	@NotBlank(message="Por favor preencha o campo email")
	@Column(name = "cli_email", length = 35, nullable = false)
	private String emailCliente;

//======================================================================================================================	
	  //Construtor builder	
	public Cliente() {
		
	}

//======================================================================================================================	
	  //Construtor and fields	
	public Cliente(Long codigoCliente, String nomeCliente, String enderecoCliente, String bairroCliente,
			String cidadeCliente, String ufCliente, String cepCliente, String cpfCliente,
			String telefoneResidencialCliente, String celularCliente, String emailCliente) {
		super();
		this.codigoCliente = codigoCliente;
		this.nomeCliente = nomeCliente;
		this.enderecoCliente = enderecoCliente;
		this.bairroCliente = bairroCliente;
		this.cidadeCliente = cidadeCliente;
		this.ufCliente = ufCliente;
		this.cepCliente = cepCliente;
		this.cpfCliente = cpfCliente;
		this.telefoneResidencialCliente = telefoneResidencialCliente;
		this.celularCliente = celularCliente;
		this.emailCliente = emailCliente;
	}

//======================================================================================================================	
	  //Getters and Setters	
	public Long getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getBairroCliente() {
		return bairroCliente;
	}

	public void setBairroCliente(String bairroCliente) {
		this.bairroCliente = bairroCliente;
	}

	public String getCidadeCliente() {
		return cidadeCliente;
	}

	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}

	public String getUfCliente() {
		return ufCliente;
	}

	public void setUfCliente(String ufCliente) {
		this.ufCliente = ufCliente;
	}

	public String getCepCliente() {
		return cepCliente;
	}

	public void setCepCliente(String cepCliente) {
		this.cepCliente = cepCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getTelefoneResidencialCliente() {
		return telefoneResidencialCliente;
	}

	public void setTelefoneResidencialCliente(String telefoneResidencialCliente) {
		this.telefoneResidencialCliente = telefoneResidencialCliente;
	}

	public String getCelularCliente() {
		return celularCliente;
	}

	public void setCelularCliente(String celularCliente) {
		this.celularCliente = celularCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

//======================================================================================================================	
	  //ToString
	@Override
	public String toString() {
		return "Cliente [codigoCliente=" + codigoCliente + ", nomeCliente=" + nomeCliente + ", enderecoCliente="
				+ enderecoCliente + ", bairroCliente=" + bairroCliente + ", cidadeCliente=" + cidadeCliente
				+ ", ufCliente=" + ufCliente + ", cepCliente=" + cepCliente + ", cpfCliente=" + cpfCliente
				+ ", telefoneResidencialCliente=" + telefoneResidencialCliente + ", celularCliente=" + celularCliente
				+ ", emailCliente=" + emailCliente + "]";
	}

//======================================================================================================================
	//HashCode and Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairroCliente == null) ? 0 : bairroCliente.hashCode());
		result = prime * result + ((celularCliente == null) ? 0 : celularCliente.hashCode());
		result = prime * result + ((cepCliente == null) ? 0 : cepCliente.hashCode());
		result = prime * result + ((cidadeCliente == null) ? 0 : cidadeCliente.hashCode());
		result = prime * result + (int) (codigoCliente ^ (codigoCliente >>> 32));
		result = prime * result + ((cpfCliente == null) ? 0 : cpfCliente.hashCode());
		result = prime * result + ((emailCliente == null) ? 0 : emailCliente.hashCode());
		result = prime * result + ((enderecoCliente == null) ? 0 : enderecoCliente.hashCode());
		result = prime * result + ((nomeCliente == null) ? 0 : nomeCliente.hashCode());
		result = prime * result + ((telefoneResidencialCliente == null) ? 0 : telefoneResidencialCliente.hashCode());
		result = prime * result + ((ufCliente == null) ? 0 : ufCliente.hashCode());
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
		Cliente other = (Cliente) obj;
		if (bairroCliente == null) {
			if (other.bairroCliente != null)
				return false;
		} else if (!bairroCliente.equals(other.bairroCliente))
			return false;
		if (celularCliente == null) {
			if (other.celularCliente != null)
				return false;
		} else if (!celularCliente.equals(other.celularCliente))
			return false;
		if (cepCliente == null) {
			if (other.cepCliente != null)
				return false;
		} else if (!cepCliente.equals(other.cepCliente))
			return false;
		if (cidadeCliente == null) {
			if (other.cidadeCliente != null)
				return false;
		} else if (!cidadeCliente.equals(other.cidadeCliente))
			return false;
		if (codigoCliente != other.codigoCliente)
			return false;
		if (cpfCliente == null) {
			if (other.cpfCliente != null)
				return false;
		} else if (!cpfCliente.equals(other.cpfCliente))
			return false;
		if (emailCliente == null) {
			if (other.emailCliente != null)
				return false;
		} else if (!emailCliente.equals(other.emailCliente))
			return false;
		if (enderecoCliente == null) {
			if (other.enderecoCliente != null)
				return false;
		} else if (!enderecoCliente.equals(other.enderecoCliente))
			return false;
		if (nomeCliente == null) {
			if (other.nomeCliente != null)
				return false;
		} else if (!nomeCliente.equals(other.nomeCliente))
			return false;
		if (telefoneResidencialCliente == null) {
			if (other.telefoneResidencialCliente != null)
				return false;
		} else if (!telefoneResidencialCliente.equals(other.telefoneResidencialCliente))
			return false;
		if (ufCliente == null) {
			if (other.ufCliente != null)
				return false;
		} else if (!ufCliente.equals(other.ufCliente))
			return false;
		return true;
	}
}
