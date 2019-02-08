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

import br.com.claudio.cesed.model.Produto;
import br.com.claudio.cesed.model.dto.CadastrarProdutoDTO;
import br.com.claudio.cesed.service.ProdutoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(value="Produto controller")
@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	ProdutoService service;
	
	@ApiOperation(value="Retorna um produto pelo id")
	@GetMapping("{id}")
	public ResponseEntity<Produto> findById(@PathVariable Long id){
		return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
	}
	
	@ApiOperation(value="Retorna uma lista de produtos")
	@GetMapping
	public ResponseEntity<List<Produto>> findAllProduto(){
		return new ResponseEntity<List<Produto>>(service.findAllProduto(), HttpStatus.OK);
	}
	
	@ApiOperation(value="Insere um produto")
	@PostMapping
	public ResponseEntity<Produto> saveProduto(@RequestBody CadastrarProdutoDTO objDto){
		service.insert(objDto);
		return new ResponseEntity<Produto>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value="Deleta um produto")
	@DeleteMapping("{id}")
	public ResponseEntity<Produto> deleteProduto(@PathVariable Long id){
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@ApiOperation(value="Atualiza um produto")
	@PutMapping("{id}")
	public ResponseEntity<Produto> updateProduto(@PathVariable Long id, @RequestBody Produto produto){
		service.update(produto);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
