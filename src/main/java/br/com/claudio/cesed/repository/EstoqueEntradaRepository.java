package br.com.claudio.cesed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.claudio.cesed.model.EstoqueEntrada;

@Repository
public interface EstoqueEntradaRepository extends JpaRepository<EstoqueEntrada, Long> {

}
