package com.galgit.healthcare.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.util.Date;

@Entity
public class Carte {
    @Id
    private Integer id;
    private Integer anneeDebut;
    private Integer anneeFin;


}
