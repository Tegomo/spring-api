package com.anuvis.net.springbootdemo.models.entities;

import com.anuvis.net.springbootdemo.enums.TypeCompte;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor @AllArgsConstructor @ToString
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long code;
    private double solde;
    private Date dateCreation;
    @Enumerated(EnumType.STRING)
    private TypeCompte type;
}
