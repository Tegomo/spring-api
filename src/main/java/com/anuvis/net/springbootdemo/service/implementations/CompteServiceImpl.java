package com.anuvis.net.springbootdemo.service.implementations;


import com.anuvis.net.springbootdemo.models.entities.Compte;
import com.anuvis.net.springbootdemo.models.entities.User;
import com.anuvis.net.springbootdemo.repository.CompteRepository;
import com.anuvis.net.springbootdemo.repository.UserRepository;
import com.anuvis.net.springbootdemo.service.interfaces.CompteService;
import com.anuvis.net.springbootdemo.service.interfaces.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CompteServiceImpl implements CompteService {

    private CompteRepository compteRepository;

    @Autowired
    CompteServiceImpl(CompteRepository compteRepository){
        this.compteRepository = compteRepository;
    };

    @Override
    public List<Compte> compteList() {
        return compteRepository.findAll();
    }

    @Override
    public Optional<Compte> findCompte(Long id) {
        Optional<Compte> compte = compteRepository.findById(id);
        if (!compte.isPresent())
            return null;
        return compte;
    }

    @Override
    public Compte save(Compte compte) {
        return compteRepository.save(compte);
    }

    @Override
    public void delete(Long code) {
        compteRepository.deleteById(code);
    }
}
