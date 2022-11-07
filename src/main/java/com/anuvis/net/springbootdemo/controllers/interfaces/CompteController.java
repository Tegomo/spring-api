package com.anuvis.net.springbootdemo.controllers.interfaces;

import com.anuvis.net.springbootdemo.models.entities.Compte;
import com.anuvis.net.springbootdemo.models.entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping( "api/v1/compte")
public interface CompteController {
    @GetMapping("/all")
    List<Compte> compteList();

    @GetMapping("/{code}")
    Optional<Compte> findCompte(@PathVariable Long code);

    @PostMapping("/new")
    Compte save(@RequestBody Compte compte);

    @PutMapping("/{code}")
    Compte update(@PathVariable Long code, @RequestBody Compte compte);

    @DeleteMapping("/{code}")
    void delete(@PathVariable Long code);

}
