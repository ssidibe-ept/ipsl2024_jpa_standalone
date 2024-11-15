package com.galgit.healthcare.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Carte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer anneeDebut;
    private Integer anneeFin;

    public Carte() {}

    public Carte(Integer anneeDebut, Integer anneeFin) {
        this.anneeDebut = anneeDebut;
        this.anneeFin = anneeFin;
    }
}
