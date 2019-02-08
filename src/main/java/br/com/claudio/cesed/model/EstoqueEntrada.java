package br.com.claudio.cesed.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EstoqueEntrada {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	private Produto produto;

	private LocalDateTime data;

	private Integer qtdEntrada;

	private Integer valorPago;

	public EstoqueEntrada() {

	}

	public EstoqueEntrada(Long id, Produto produto, LocalDateTime data, Integer qtdEntrada, Integer valorPago) {
		super();
		this.id = id;
		this.produto = produto;
		this.data = data;
		this.qtdEntrada = qtdEntrada;
		this.valorPago = valorPago;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Integer getQtdEntrada() {
		return qtdEntrada;
	}

	public void setQtdEntrada(Integer qtdEntrada) {
		this.qtdEntrada = qtdEntrada;
	}

	public Integer getValorPago() {
		return valorPago;
	}

	public void setValorPago(Integer valorPago) {
		this.valorPago = valorPago;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		EstoqueEntrada other = (EstoqueEntrada) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
