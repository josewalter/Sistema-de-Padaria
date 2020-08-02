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

	public ContasPagar() {
		
	}

	public ContasPagar(Long codigoContasPagar, Date dataCompra, Date dataVencimento, Double valorReceber,
			String formaPagamento, Fornecedor fornecedor, Produto produto) {
		super();
		this.codigoContasPagar = codigoContasPagar;
		this.dataCompra = dataCompra;
		this.dataVencimento = dataVencimento;
		this.valorReceber = valorReceber;
		this.formaPagamento = formaPagamento;
		this.fornecedor = fornecedor;
		this.produto = produto;
	}

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

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "ContasPagar [codigoContasPagar=" + codigoContasPagar + ", dataCompra=" + dataCompra
				+ ", dataVencimento=" + dataVencimento + ", valorReceber=" + valorReceber + ", formaPagamento="
				+ formaPagamento + ", fornecedor=" + fornecedor + ", produto=" + produto + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoContasPagar == null) ? 0 : codigoContasPagar.hashCode());
		result = prime * result + ((dataCompra == null) ? 0 : dataCompra.hashCode());
		result = prime * result + ((dataVencimento == null) ? 0 : dataVencimento.hashCode());
		result = prime * result + ((formaPagamento == null) ? 0 : formaPagamento.hashCode());
		result = prime * result + ((fornecedor == null) ? 0 : fornecedor.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		result = prime * result + ((valorReceber == null) ? 0 : valorReceber.hashCode());
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
		ContasPagar other = (ContasPagar) obj;
		if (codigoContasPagar == null) {
			if (other.codigoContasPagar != null)
				return false;
		} else if (!codigoContasPagar.equals(other.codigoContasPagar))
			return false;
		if (dataCompra == null) {
			if (other.dataCompra != null)
				return false;
		} else if (!dataCompra.equals(other.dataCompra))
			return false;
		if (dataVencimento == null) {
			if (other.dataVencimento != null)
				return false;
		} else if (!dataVencimento.equals(other.dataVencimento))
			return false;
		if (formaPagamento == null) {
			if (other.formaPagamento != null)
				return false;
		} else if (!formaPagamento.equals(other.formaPagamento))
			return false;
		if (fornecedor == null) {
			if (other.fornecedor != null)
				return false;
		} else if (!fornecedor.equals(other.fornecedor))
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		if (valorReceber == null) {
			if (other.valorReceber != null)
				return false;
		} else if (!valorReceber.equals(other.valorReceber))
			return false;
		return true;
	}
	
    

}
