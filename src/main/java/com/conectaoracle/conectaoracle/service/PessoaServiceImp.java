package com.conectaoracle.conectaoracle.service;

import com.conectaoracle.conectaoracle.domain.Pessoa;
import com.conectaoracle.conectaoracle.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PessoaServiceImp implements PessoaService{

    @Autowired
    private PessoaRepository repository;

    @Override
    public List<Pessoa> getPessoas(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
