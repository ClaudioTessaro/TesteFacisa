package br.com.claudio.cesed.model.dto;

public class CadastrarCategoriaDTO {

	private String nomeCategoria;
	
	public CadastrarCategoriaDTO() {
		
	}

	public CadastrarCategoriaDTO(String nomeCategoria) {
		super();
		this.nomeCategoria = nomeCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
	
	
	
}
