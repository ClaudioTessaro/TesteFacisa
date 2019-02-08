package br.com.claudio.cesed.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String codBarra;

	private String nome;

	private Double qtdEstoque;

	@ManyToOne
	@JoinColumn(name="id_tipoUnidade")
	private TipoUnidade tipoUnidade;

	private Float tamanhoUnidade;

	private boolean comercializavel=true;

	private Float valorUnitarioVenda;

	@ManyToMany
	@JoinTable(name = "produto_categoria", joinColumns = @JoinColumn(name = "Produto_id"), inverseJoinColumns = @JoinColumn(name = "Categoria_id"))
	private List<Categoria> categoria;

	public Produto() {

	}

	public Produto(Long id, String codBarra, String nome, Double qtdEstoque, TipoUnidade tipoUnidade,
			Float tamanhoUnidade, Float valorUnitarioVenda) {
		super();
		this.id = id;
		this.codBarra = codBarra;
		this.nome = nome;
		this.qtdEstoque = qtdEstoque;
		this.tipoUnidade = tipoUnidade;
		this.tamanhoUnidade = tamanhoUnidade;
		this.valorUnitarioVenda = valorUnitarioVenda;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodBarra() {
		return codBarra;
	}

	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}

	public Double getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(Double qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public TipoUnidade getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(TipoUnidade tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}

	public Float getTamanhoUnidade() {
		return tamanhoUnidade;
	}

	public void setTamanhoUnidade(Float tamanhoUnidade) {
		this.tamanhoUnidade = tamanhoUnidade;
	}

	public boolean isComercializavel() {
		return comercializavel;
	}

	public void setComercializavel(boolean comercializavel) {
		this.comercializavel = comercializavel;
	}

	public Float getValorUnitarioVenda() {
		return valorUnitarioVenda;
	}

	public void setValorUnitarioVenda(Float valorUnitarioVenda) {
		this.valorUnitarioVenda = valorUnitarioVenda;
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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
