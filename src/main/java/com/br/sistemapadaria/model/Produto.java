package com.br.sistemapadaria.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/*
 * Descrição: Entidade produto
 * Data: 28/05/2020  23:30
 * Autor: José Walter
 */
@Entity
@Table(name = "tbl_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "pro_codigo")
	private Long   codigoProduto;
	
	@NotBlank(message="Por favor preencha o campo nome")
	@Column(name = "pro_nome", length = 25, nullable = false)
	private String nomeProduto;
	
	@NotBlank(message="Por favor preencha o campo descrição do produto")
	@Column(name = "pro_descricao", length = 35, nullable = false)
	private String descricao;
	
	@NotBlank(message="Por favor preencha o campo quantidade do produto")
	@Column(name = "pro_quantidade", length = 5, nullable = false)
	private int    quantidade;
	
	@NotBlank(message="Por favor preencha o campo data de entrada")
	@Column(name = "pro_data_entrada", length = 10, nullable = false)
	private LocalDate dataEntrada;
	
	@NotBlank(message="Por favor preencha o campo data de saída")
	@Column(name = "pro_data_saida", length = 10, nullable = false)
	private LocalDate dataSaida;

	//======================================================================================================================	
	  //Construtor builder
	public Produto() {
		
	}

	//======================================================================================================================	
	  //Construtor and fields
	public Produto(Long codigoProduto, @NotBlank(message = "Por favor preencha o campo nome") String nomeProduto,
			@NotBlank(message = "Por favor preencha o campo descrição do produto") String descricao,
			@NotBlank(message = "Por favor preencha o campo quantidade do produto") int quantidade,
			@NotBlank(message = "Por favor preencha o campo data de entrada") LocalDate dataEntrada,
			@NotBlank(message = "Por favor preencha o campo data de saída") LocalDate dataSaida) {
		super();
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}
	
	
	//======================================================================================================================	
	  //Getters and Setters	
	public Long getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(Long codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

	//======================================================================================================================	
	  //ToString
	@Override
	public String toString() {
		return "Produto [codigoProduto=" + codigoProduto + ", nomeProduto=" + nomeProduto + ", descricao=" + descricao
				+ ", quantidade=" + quantidade + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + "]";
	}

	//======================================================================================================================
		//HashCode and Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoProduto == null) ? 0 : codigoProduto.hashCode());
		result = prime * result + ((dataEntrada == null) ? 0 : dataEntrada.hashCode());
		result = prime * result + ((dataSaida == null) ? 0 : dataSaida.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((nomeProduto == null) ? 0 : nomeProduto.hashCode());
		result = prime * result + quantidade;
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
		Produto other = (Produto) obj;
		if (codigoProduto == null) {
			if (other.codigoProduto != null)
				return false;
		} else if (!codigoProduto.equals(other.codigoProduto))
			return false;
		if (dataEntrada == null) {
			if (other.dataEntrada != null)
				return false;
		} else if (!dataEntrada.equals(other.dataEntrada))
			return false;
		if (dataSaida == null) {
			if (other.dataSaida != null)
				return false;
		} else if (!dataSaida.equals(other.dataSaida))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (nomeProduto == null) {
			if (other.nomeProduto != null)
				return false;
		} else if (!nomeProduto.equals(other.nomeProduto))
			return false;
		if (quantidade != other.quantidade)
			return false;
		return true;
	}
}





