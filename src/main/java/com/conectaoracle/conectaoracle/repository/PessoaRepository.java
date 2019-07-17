package com.conectaoracle.conectaoracle.repository;

import com.conectaoracle.conectaoracle.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {

}
