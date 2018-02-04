package com.project.rest.app.controller;

import com.project.rest.app.entity.Pessoa;
import com.project.rest.app.repository.PessoaRepository;
import com.project.rest.app.service.MessageNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/cliente")
public class PessoaController {

    private static List<Pessoa> list = new ArrayList<Pessoa>(  );

    @Autowired
    private PessoaRepository repository;
//    static {
//        list.add( new Pessoa( 1l,"leandro marques" ) );
//        list.add( new Pessoa( 2l,"Laura marques" ) );
//    }

    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void addCustomer(@RequestBody Pessoa pessoa) {
        list.add( pessoa );
    }

    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pessoa> getList() {
        return list;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Pessoa getCustomer(@PathVariable("id") Long id ) {
        for (Pessoa pessoa: list) {
            if (pessoa.getId().equals( id )){
                return pessoa;
            }
        }
        throw new MessageNotFoundException();
    }

    @RequestMapping(value = "", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void updateCustomer(@RequestBody Pessoa pessoa) {
        list.add( pessoa );
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Pessoa update(@PathVariable("id") Long id, Pessoa pessoa) {
        for (Pessoa cliente: list) {
            if (cliente.getId().equals( id )){
                cliente.setNome( pessoa.getNome() );
            }
        }
        return pessoa;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable("id") Long id) {
        Pessoa pessoa = null;
        for (Pessoa cliente: list) {
            if (cliente.getId().equals( id )){
                pessoa = cliente;
            }
        }
        if (pessoa == null){
            throw new MessageNotFoundException();
        } else {
            list.remove( pessoa );
        }
    }

}
