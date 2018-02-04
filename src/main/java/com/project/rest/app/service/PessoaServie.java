package com.project.rest.app.service;


import com.project.rest.app.entity.Pessoa;
import com.project.rest.app.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaServie {

    @Autowired private PessoaRepository repository;

    public Pessoa save( Pessoa pessoa ) {
        return repository.save( pessoa );
    }

    public Iterable <Pessoa> save( Iterable <Pessoa> pessoas ) {
        return repository.save( pessoas );
    }

    public Pessoa findOne( String nomePessoa ) {
        return repository.findOne( nomePessoa );
    }

    public boolean exists( String pessoa ) {
        return repository.exists( pessoa );
    }

    public Iterable <Pessoa> findAll() {
        return repository.findAll();
    }

    public Iterable <Pessoa> findAll( Iterable <String> strings ) {
        return repository.findAll( strings );
    }

    public long count() {
        return repository.count();
    }

    public void delete( String nome ) {
        repository.delete( nome );
    }

    public void delete( Pessoa pessoa ) {
        repository.delete( pessoa );
    }

    public void delete( Iterable <? extends Pessoa> pessoas ) {
        repository.delete( pessoas );
    }

    public void deleteAll() {
        repository.deleteAll();
    }
}
