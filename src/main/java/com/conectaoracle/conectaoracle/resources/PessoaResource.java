package com.conectaoracle.conectaoracle.resources;

import com.conectaoracle.conectaoracle.domain.Pessoa;
import com.conectaoracle.conectaoracle.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoa/")
public class PessoaResource {

    @Autowired
    private PessoaService service;

    @GetMapping
    public @ResponseBody ResponseEntity<?> getPessoas(Pageable pageable){
        List<Pessoa> pessoas = service.getPessoas(pageable);
        return ResponseEntity.ok().body(pessoas);
    }
}
