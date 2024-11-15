package com.galgit.healthcare.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Filiere {
    @Id
    private String code;
    private String nom;

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
