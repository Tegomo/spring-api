package com.anuvis.net.springbootdemo;

import com.anuvis.net.springbootdemo.enums.TypeCompte;
import com.anuvis.net.springbootdemo.models.entities.Compte;
import com.anuvis.net.springbootdemo.repository.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CompteRepository compteRepository){
        return args -> {
          compteRepository.save(new Compte(null, 20000,new Date(), TypeCompte.COURANT));
          compteRepository.save(new Compte(null, 25000,new Date(), TypeCompte.EPARGNE));
        };
    }

}
