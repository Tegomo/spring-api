package com.anuvis.net.springbootdemo.service.interfaces;

import com.anuvis.net.springbootdemo.models.entities.Compte;

import java.util.List;
import java.util.Optional;


public interface CompteService {
    List<Compte> compteList();

    Optional<Compte> findCompte(Long code);

    Compte save(Compte compte);

    void delete(Long code);
}
