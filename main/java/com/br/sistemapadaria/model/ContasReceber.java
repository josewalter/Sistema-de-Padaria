package com.br.sistemapadaria.model;

import java.util.Date;

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
 * Descrição: Entidade Contas a receber 
 * Data: 08/12/2019  13:46
 * Autor: José Walter
 */

@Entity
@Table(name="tbl_contas_receber")
public class ContasReceber {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "contas_receber_codigo")
	private Long codigoContasReceber;
	
	@Column(name = "contas_receber_data_compra", length = 10, nullable = false)
	private Date dataCompra;
	
	@Column(name = "contas_receber_data_vencimento", length = 10, nullable = false)
	private Date dataVencimento;
	
	@Column(name = "contas_receber_valor", scale = 7, precision = 2, nullable = false)
	private Double valorReceber;
	
	@Column(name = "contas_receber_forma_pagamento", length = 30, nullable = false)
	private String formaPagamento;
	/*
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_cliente_cli_codigo", referencedColumnName = "cli_codigo", nullable = false)
	private Cliente cliente;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_produto_pro_codigo", referencedColumnName = "pro_codigo", nullable = false)
	private Produto produto;
*/
//======================================================================================================================	
	  //Construtor builder
	public ContasReceber() {

		
	}

//======================================================================================================================	
	  //Construtor and fields
	public ContasReceber(Long codigoContasReceber, Date dataCompra, Date dataVencimento, Double valorReceber,
			String formaPagamento) {
		super();
		this.codigoContasReceber = codigoContasReceber;
		this.dataCompra = dataCompra;
		this.dataVencimento = dataVencimento;
		this.valorReceber = valorReceber;
		this.formaPagamento = formaPagamento;
		
	}

//======================================================================================================================	
	  //Getters and Setters
	public Long getCodigoContasReceber() {
		return codigoContasReceber;
	}

	public void setCodigoContasReceber(Long codigoContasReceber) {
		this.codigoContasReceber = codigoContasReceber;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValorReceber() {
		return valorReceber;
	}

	public void setValorReceber(Double valorReceber) {
		this.valorReceber = valorReceber;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	}
