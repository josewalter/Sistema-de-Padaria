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
 * Descrição: Entidade Contas a pagar 
 * Data: 03/01/2020  17:27
 * Autor: José Walter
 */

@Entity
@Table(name="tbl_contas_pagar")
public class ContasPagar {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "contas_pagar_codigo")
	private Long codigoContasPagar;
	
	@Column(name = "contas_pagar_data_compra", length = 10, nullable = false)
	private Date dataCompra;
	
	@Column(name = "contas_pagar_data_vencimento", length = 10, nullable = false)
	private Date dataVencimento;
	
	@Column(name = "contas_pagar_valor", scale = 7, precision = 2, nullable = false)
	private Double valorReceber;
	
	@Column(name = "contas_pagar_forma_pagamento", length = 30, nullable = false)
	private String formaPagamento;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_fornecedor_for_codigo", referencedColumnName = "for_codigo", nullable = false)
	private Fornecedor fornecedor;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_produto_pro_codigo", referencedColumnName = "pro_codigo", nullable = false)
	private Produto produto;
	
//======================================================================================================================	
	  //Construtor builder
	public ContasPagar() {
		
	}

//======================================================================================================================	
	  //Construtor and fields
	public ContasPagar(Long codigoContasPagar, Date dataCompra, Date dataVencimento, Double valorReceber,
			String formaPagamento) {
		super();
		this.codigoContasPagar = codigoContasPagar;
		this.dataCompra = dataCompra;
		this.dataVencimento = dataVencimento;
		this.valorReceber = valorReceber;
		this.formaPagamento = formaPagamento;
		
	}

//======================================================================================================================	
	  //Getters and Setters	
	public Long getCodigoContasPagar() {
		return codigoContasPagar;
	}

	public void setCodigoContasPagar(Long codigoContasPagar) {
		this.codigoContasPagar = codigoContasPagar;
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
