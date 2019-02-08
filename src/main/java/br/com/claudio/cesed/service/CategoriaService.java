package br.com.claudio.cesed.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.claudio.cesed.model.Categoria;
import br.com.claudio.cesed.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository repo;

	public void insert(Categoria produto) {
		repo.save(produto);
	}

	public Categoria findById(Long id) {
		return repo.findById(id).get();
	}

	public void update(Categoria produto) {
		findById(produto.getId());
		repo.save(produto);

	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

	public List<Categoria> findAllCategoria() {
		return repo.findAll();
	}
	
	public List<Categoria> findListCategorias(List<Long> ids){
		
		List<Categoria> categorias = new ArrayList<>();
		
		for(Long id :ids) {
			Categoria categoria = repo.findById(id).get();
			categorias.add(categoria);
		}
		
		return categorias;
		
	}

}
