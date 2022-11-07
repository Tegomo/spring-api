package com.anuvis.net.springbootdemo.controllers.api;

import com.anuvis.net.springbootdemo.controllers.interfaces.CompteController;
import com.anuvis.net.springbootdemo.models.entities.Compte;
import com.anuvis.net.springbootdemo.service.interfaces.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CompteApi implements CompteController {

    private CompteService compteService;

    @Autowired
    public CompteApi(CompteService compteService) {
        this.compteService = compteService;
    }

    @Override
    public List<Compte> compteList() {
        return compteService.compteList();
    }

    @Override
    public Optional<Compte> findCompte(Long code) {
        return compteService.findCompte(code);
    }

    @Override
    public Compte save(Compte compte) {
        return compteService.save(compte);
    }

    @Override
    public Compte update(Long code, Compte compte) {
        compte.setCode(code);
        return compteService.save(compte);
    }

    @Override
    public void delete(Long code) {
        compteService.delete(code);
    }


}
