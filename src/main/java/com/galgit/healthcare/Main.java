package com.galgit.healthcare;

import com.galgit.healthcare.entities.Etudiant;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("ing2Pu");
        EntityManager em = emf.createEntityManager();


        em.close();
        emf.close();
    }
}