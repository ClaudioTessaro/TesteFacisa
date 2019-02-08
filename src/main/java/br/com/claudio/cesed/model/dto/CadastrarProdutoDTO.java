package br.com.claudio.cesed.model.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import br.com.claudio.cesed.model.Categoria;
import br.com.claudio.cesed.model.TipoUnidade;

public class CadastrarProdutoDTO {

	private String codBarra;

	private String nome;

	private Double qtdEstoque;

	private TipoUnidade tipoUnidade;

	private Float tamanhoUnidade;

	private Float valorUnitarioVenda;

	private List<Long> idsCategoria = new ArrayList<>();

	public CadastrarProdutoDTO() {

	}

	public CadastrarProdutoDTO(String codBarra, String nome, Double qtdEstoque, TipoUnidade tipoUnidade,
			Float tamanhoUnidade, Float valorUnitarioVenda, List<Long> idsCategoria) {
		super();
		this.codBarra = codBarra;
		this.nome = nome;
		this.qtdEstoque = qtdEstoque;
		this.tipoUnidade = tipoUnidade;
		this.tamanhoUnidade = tamanhoUnidade;
		this.valorUnitarioVenda = valorUnitarioVenda;
		this.idsCategoria = idsCategoria;
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

	public Float getValorUnitarioVenda() {
		return valorUnitarioVenda;
	}

	public void setValorUnitarioVenda(Float valorUnitarioVenda) {
		this.valorUnitarioVenda = valorUnitarioVenda;
	}

	public List<Long> getIdsCategoria() {
		return idsCategoria;
	}

	public void setIdsCategoria(List<Long> idsCategoria) {
		this.idsCategoria = idsCategoria;
	}

}
