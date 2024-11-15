package com.galgit.healthcare.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class CoursCertification {
    @Id
    private Integer id;
    private String nom;

    @ManyToMany(mappedBy = "certifications")
    private List<Etudiant> etudiants;

}
