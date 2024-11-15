package com.galgit.healthcare.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class CoursCertification {
    @Id
    private Integer id;
    private String nom;

    @ManyToMany(mappedBy = "certifications", fetch = FetchType.EAGER)
    private List<Etudiant> etudiants;

}
