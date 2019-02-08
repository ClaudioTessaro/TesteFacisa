package br.com.claudio.cesed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.claudio.cesed.model.Produto;
import br.com.claudio.cesed.model.dto.CadastrarProdutoDTO;
import br.com.claudio.cesed.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;
	
	@Autowired
	private CategoriaService categoriaService;

	public void insert(CadastrarProdutoDTO objDto) {
		Produto produto = fromDTO(objDto);
		produto.setCategoria(categoriaService.findListCategorias(objDto.getIdsCategoria()));
		repo.save(produto);
	}

	public Produto findById(Long id) {
		
		return repo.findById(id).get();
	}

	public void update(Produto produto) {
		findById(produto.getId());
		repo.save(produto);

	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

	public List<Produto> findAllProduto() {
		return repo.findAll();
	}
	
	public Produto fromDTO(CadastrarProdutoDTO objDto) {
		return new Produto(null, objDto.getCodBarra(), objDto.getNome(), objDto.getQtdEstoque(), objDto.getTipoUnidade(), objDto.getTamanhoUnidade(), objDto.getValorUnitarioVenda());
	}

}
