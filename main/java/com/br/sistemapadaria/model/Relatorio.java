package com.br.sistemapadaria.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Descrição: Entidade de relátorio
 * Data: 06/12/2019  18:15
 * Autor: José Walter
 */

@Entity
@Table(name="tbl_relatorio")
public class Relatorio {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "rel_codigo")
	private Long codgioRelatorio;
	
	@Column(name = "rel_nome_produto", length = 35, nullable = false)
	private String produto;
	
	@Column(name = "rel_data_venda", length = 8, nullable = false)
	private Date dataVenda;
	
	@Column(name = "rel_valor_produto", scale=7, precision= 2,  nullable = false)
	private Double valorProduto;
	
	@Column(name = "rel_funcionario", length = 35, nullable = false)
	private String funcionario;
	
	@Column(name = "rel_cliente", length = 35, nullable = false)
	private String cliente;
	
//======================================================================================================================	
	  //Construtor builder
	public Relatorio() {
		
	}

//======================================================================================================================	
	  //Construtor and fields
	public Relatorio(Long codgioRelatorio, String produto, Date dataVenda, Double valorProduto, String funcionario,
			String cliente) {
		super();
		this.codgioRelatorio = codgioRelatorio;
		this.produto = produto;
		this.dataVenda = dataVenda;
		this.valorProduto = valorProduto;
		this.funcionario = funcionario;
		this.cliente = cliente;
	}

//======================================================================================================================	
	  //Getters and Setters	
	public Long getCodgioRelatorio() {
		return codgioRelatorio;
	}

	public void setCodgioRelatorio(Long codgioRelatorio) {
		this.codgioRelatorio = codgioRelatorio;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

//======================================================================================================================	
	  //ToString
	@Override
	public String toString() {
		return "Relatorio [codgioRelatorio=" + codgioRelatorio + ", produto=" + produto + ", dataVenda=" + dataVenda
				+ ", valorProduto=" + valorProduto + ", funcionario=" + funcionario + ", cliente=" + cliente + "]";
	}

//======================================================================================================================
			//HashCode and Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((codgioRelatorio == null) ? 0 : codgioRelatorio.hashCode());
		result = prime * result + ((dataVenda == null) ? 0 : dataVenda.hashCode());
		result = prime * result + ((funcionario == null) ? 0 : funcionario.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		result = prime * result + ((valorProduto == null) ? 0 : valorProduto.hashCode());
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
		Relatorio other = (Relatorio) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (codgioRelatorio == null) {
			if (other.codgioRelatorio != null)
				return false;
		} else if (!codgioRelatorio.equals(other.codgioRelatorio))
			return false;
		if (dataVenda == null) {
			if (other.dataVenda != null)
				return false;
		} else if (!dataVenda.equals(other.dataVenda))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		if (valorProduto == null) {
			if (other.valorProduto != null)
				return false;
		} else if (!valorProduto.equals(other.valorProduto))
			return false;
		return true;
	}
}
