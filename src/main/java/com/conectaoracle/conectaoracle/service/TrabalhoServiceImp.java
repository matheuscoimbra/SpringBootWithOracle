package com.conectaoracle.conectaoracle.service;

import com.conectaoracle.conectaoracle.domain.Trabalho;
import com.conectaoracle.conectaoracle.repository.TrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrabalhoServiceImp implements TrabalhoService{

    @Autowired
    private TrabalhoRepository repository;


    @Override
    public List<Trabalho> trabalhos() {
        return repository.findAll();
    }
}
