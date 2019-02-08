package br.com.claudio.cesed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.claudio.cesed.model.TipoUnidade;

@Repository
public interface TipoUnidadeRepository extends JpaRepository<TipoUnidade, Long> {

}
