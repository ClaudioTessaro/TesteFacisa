package br.com.claudio.cesed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.claudio.cesed.model.Categoria;
import br.com.claudio.cesed.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	
	@Autowired
	CategoriaService service;
	
	@GetMapping("{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Long id){
		return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAllCategoria(){
		return new ResponseEntity<List<Categoria>>(service.findAllCategoria(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Categoria> saveCategoria(@RequestBody Categoria produto){
		service.insert(produto);
		return new ResponseEntity<Categoria>(HttpStatus.CREATED);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Categoria> deleteCategoria(@PathVariable Long id){
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Categoria> updateCategoria(@PathVariable Long id, @RequestBody Categoria produto){
		service.update(produto);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
