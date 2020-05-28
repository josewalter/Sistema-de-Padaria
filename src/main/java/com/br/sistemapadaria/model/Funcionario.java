package com.br.sistemapadaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
 * Descrição: Classe de funcionário
 * Data: 15/11/2019  23:11
 * Autor: José Walter
 */

@Entity
@Table(name ="tbl_funcionario")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "fun_codigo")
	private Long codigoFuncionario;
	
	@Column(name = "fun_nome", length = 35, nullable = false)
	private String nomeFuncionario;
	
	@Column(name = "fun_endereco", length = 35, nullable = false)
	private String enderecoFuncionario;
	
	@Column(name = "fun_bairro", length = 25, nullable = false)
    private String bairroFuncionario;
	
	@Column(name = "fun_cidade", length = 30, nullable = false)
    private String cidadeFuncionario;
	
	@Column(name = "fun_uf", length = 5, nullable = false)
    private String ufFuncionario;
	
	@Column(name = "fun_cep", length = 10, nullable = false)
	private String cepFuncionario;
	
	@Column(name = "fun_cpf", length = 15, nullable = false, unique = true)
	private String cpfFuncionario;
	
	@Column(name = "fun_telefone_residencial", length = 14, nullable = false)
	private String telefoneFuncionario;
	
	@Column(name = "fun_celular", length = 15, nullable = false)
	private String celularFuncionario;
	
	@Column(name = "fun_email", length = 30, nullable = false)
	private String emailFuncionario;
	/*
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_relatorio_rel_codigo", referencedColumnName = "rel_codigo", nullable = false)
	private Relatorio relatorio;
*/
//======================================================================================================================	
	  //Construtor builder	
	
	public Funcionario() {
		
	}
	
//======================================================================================================================	
	  //Construtor and fields	

	public Funcionario(Long codigoFuncionario, String nomeFuncionario, String enderecoFuncionario,
			String bairroFuncionario, String cidadeFuncionario, String ufFuncionario, String cepFuncionario,
			String cpfFuncionario, String telefoneFuncionario, String celularFuncionario, String emailFuncionario) {
		super();
		this.codigoFuncionario = codigoFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.enderecoFuncionario = enderecoFuncionario;
		this.bairroFuncionario = bairroFuncionario;
		this.cidadeFuncionario = cidadeFuncionario;
		this.ufFuncionario = ufFuncionario;
		this.cepFuncionario = cepFuncionario;
		this.cpfFuncionario = cpfFuncionario;
		this.telefoneFuncionario = telefoneFuncionario;
		this.celularFuncionario = celularFuncionario;
		this.emailFuncionario = emailFuncionario;
        
	}

//======================================================================================================================	
	  //Getters and Setters	
	
	public Long getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(Long codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getEnderecoFuncionario() {
		return enderecoFuncionario;
	}

	public void setEnderecoFuncionario(String enderecoFuncionario) {
		this.enderecoFuncionario = enderecoFuncionario;
	}

	public String getBairroFuncionario() {
		return bairroFuncionario;
	}

	public void setBairroFuncionario(String bairroFuncionario) {
		this.bairroFuncionario = bairroFuncionario;
	}

	public String getCidadeFuncionario() {
		return cidadeFuncionario;
	}

	public void setCidadeFuncionario(String cidadeFuncionario) {
		this.cidadeFuncionario = cidadeFuncionario;
	}

	public String getUfFuncionario() {
		return ufFuncionario;
	}

	public void setUfFuncionario(String ufFuncionario) {
		this.ufFuncionario = ufFuncionario;
	}

	public String getCepFuncionario() {
		return cepFuncionario;
	}

	public void setCepFuncionario(String cepFuncionario) {
		this.cepFuncionario = cepFuncionario;
	}

	public String getCpfFuncionario() {
		return cpfFuncionario;
	}

	public void setCpfFuncionario(String cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}

	public String getTelefoneFuncionario() {
		return telefoneFuncionario;
	}

	public void setTelefoneFuncionario(String telefoneFuncionario) {
		this.telefoneFuncionario = telefoneFuncionario;
	}

	public String getCelularFuncionario() {
		return celularFuncionario;
	}

	public void setCelularFuncionario(String celularFuncionario) {
		this.celularFuncionario = celularFuncionario;
	}

	public String getEmailFuncionario() {
		return emailFuncionario;
	}

	public void setEmailFuncionario(String emailFuncionario) {
		this.emailFuncionario = emailFuncionario;
	}
	
}


