package com.anuvis.net.springbootdemo.repository;

import com.anuvis.net.springbootdemo.models.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
