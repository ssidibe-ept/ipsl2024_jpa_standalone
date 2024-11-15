package com.galgit.healthcare.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Etudiant implements Serializable {
    @Id
    private Integer id;

    private String nom;

    @Column(name = "PRENOM", length = 50)
    private String prenom;

    private String adresse;

    private String telephone;

    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @OneToOne
    @JoinColumn(nullable = false)
    private Carte carte;

    @ManyToOne
    private Filiere filiere;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    public Carte getCarte() {
        return carte;
    }

    public void setCarte(Carte carte) {
        this.carte = carte;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "adresse='" + adresse + '\'' +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
