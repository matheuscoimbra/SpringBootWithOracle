package com.conectaoracle.conectaoracle;

import com.conectaoracle.conectaoracle.domain.Pessoa;
import com.conectaoracle.conectaoracle.domain.Trabalho;
import com.conectaoracle.conectaoracle.repository.PessoaRepository;
import com.conectaoracle.conectaoracle.repository.TrabalhoRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class ConectaoracleApplication {


    @Autowired
    private TrabalhoRepository trabalhoRepository;

    @Autowired
    PessoaRepository pessoaRepository;

    public static void main(String[] args) {
        SpringApplication.run(ConectaoracleApplication.class, args);
    }

    @Bean
    InitializingBean sendDatabase() {
        return () -> {
            Trabalho trab1 = new Trabalho("Professor");

            trabalhoRepository.save(trab1);

            Pessoa p1 = new Pessoa();
            p1.setCpf("1515155");
            p1.setNome("Joao");
            p1.setTrabalhoList(Arrays.asList(trab1));

            pessoaRepository.save(p1);


        };
    }
}
