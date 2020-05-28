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
 * Descrição: Classe da venda
 * Data: 06/12/2019  16:30
 * Autor: José Walter
 */

@Entity
@Table(name="tbl_venda")
public class Venda {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "ven_codigo")
	private Long codigoVenda;
	
	@Column(name = "ven_horario", length = 6, nullable = false)
	private Date horarioVenda;
	
	@Column(name = "ven_valor_total", length = 5, nullable = false)
	private Double valorTotal;
	
	@Column(name = "ven_nome_produto", length = 35, nullable = false)
	private String produto;	
	/*
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_funcionario_fun_codigo", referencedColumnName = "fun_codigo", nullable = false)
	private Funcionario funcionario;
*/
//======================================================================================================================	
	  //Construtor builder	
	public Venda() {
		
	}

//======================================================================================================================	
	  //Construtor and fields	
	public Venda(Long codigoVenda, Date horarioVenda, Double valorTotal, String produto) {
		super();
		this.codigoVenda = codigoVenda;
		this.horarioVenda = horarioVenda;
		this.valorTotal = valorTotal;
		this.produto = produto;
		
	}

//======================================================================================================================	
	  //Getters and Setters		
	public Long getCodigoVenda() {
		return codigoVenda;
	}

	public void setCodigoVenda(Long codigoVenda) {
		this.codigoVenda = codigoVenda;
	}

	public Date getHorarioVenda() {
		return horarioVenda;
	}

	public void setHorarioVenda(Date horarioVenda) {
		this.horarioVenda = horarioVenda;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}


	}



