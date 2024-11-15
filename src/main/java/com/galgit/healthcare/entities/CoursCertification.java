package com.galgit.healthcare.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CoursCertification {
    @Id
    private Integer id;
    private String nom;
}
