package com.conectaoracle.conectaoracle.service;

import com.conectaoracle.conectaoracle.domain.Pessoa;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PessoaService {

    List<Pessoa> getPessoas(Pageable pageable);
}
