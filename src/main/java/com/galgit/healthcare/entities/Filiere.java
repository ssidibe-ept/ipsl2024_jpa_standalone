package com.galgit.healthcare.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Filiere {
    @Id
    private String code;
    private String nom;

    @OneToMany(mappedBy ="filiere", fetch = FetchType.EAGER)
    private List<Etudiant> etudiants;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
