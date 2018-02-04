package com.project.rest.app.repository;

import com.project.rest.app.entity.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, String> {
}
