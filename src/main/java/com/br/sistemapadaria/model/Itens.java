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
 * Descrição: Entidade Itens
 * Data: 06/12/2019  16:50
 * Autor: José Walter
 */

@Entity
@Table(name="tbl_itens")
public class Itens {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "iten_codigo")
	private Long itenCodigo;
	
	@Column(name = "iten_quantidade", nullable = false)
	private Integer quantidade;
	
	@Column(name = "iten_valor_parcial", length = 5, nullable = false)
	private Double valorParcial;
	/*
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_venda_ven_codigo", referencedColumnName = "ven_codigo", nullable = false)
	private Venda venda;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_produto_pro_codigo", referencedColumnName = "pro_codigo", nullable = false)
	private Produto produto;
*/
//======================================================================================================================	
	  //Construtor builder	
	public Itens() {
		
	}

//======================================================================================================================	
	  //Construtor and fields
	public Itens(Long itenCodigo, Integer quantidade, Double valorParcial) {
		super();
		this.itenCodigo = itenCodigo;
		this.quantidade = quantidade;
		this.valorParcial = valorParcial;
		
	}

//======================================================================================================================	
	  //Getters and Setters	
	public Long getItenCodigo() {
		return itenCodigo;
	}

	public void setItenCodigo(Long itenCodigo) {
		this.itenCodigo = itenCodigo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValorParcial() {
		return valorParcial;
	}

	public void setValorParcial(Double valorParcial) {
		this.valorParcial = valorParcial;
	}



}
