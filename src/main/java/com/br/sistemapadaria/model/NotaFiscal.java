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
 * Descrição: Entidade Nota Fiscal
 * Data: 08/12/2019  12:27
 * Autor: José Walter
 */

@Entity
@Table(name="tbl_nota_fiscal")
public class NotaFiscal {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "nota_codigo")
	private Long codigoNotaFiscal;
	
	@Column(name = "nota_data_compra", length = 10, nullable = false)
	private Date dataCompra;
	
	@Column(name = "nota_valor_total", scale = 7, precision = 2, nullable = false)
	private Double valorTotal;
	/*
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_cliente_cli_codigo", referencedColumnName = "cli_codigo", nullable = false)
	private Cliente cliente;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_produto_pro_codigo", referencedColumnName = "pro_codigo", nullable = false)
	private Produto produto;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_funcionario_fun_codigo", referencedColumnName = "fun_codigo", nullable = false)
	private Funcionario funcionario;
*/
//======================================================================================================================	
	  //Construtor builder
	public NotaFiscal() {
		
	}

//======================================================================================================================	
	  //Construtor and fields
	public NotaFiscal(Long codigoNotaFiscal, Date dataCompra, Double valorTotal) {
		super();
		this.codigoNotaFiscal = codigoNotaFiscal;
		this.dataCompra = dataCompra;
		this.valorTotal = valorTotal;
		
	}

//======================================================================================================================	
	  //Getters and Setters
	public Long getCodigoNotaFiscal() {
		return codigoNotaFiscal;
	}

	public void setCodigoNotaFiscal(Long codigoNotaFiscal) {
		this.codigoNotaFiscal = codigoNotaFiscal;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
