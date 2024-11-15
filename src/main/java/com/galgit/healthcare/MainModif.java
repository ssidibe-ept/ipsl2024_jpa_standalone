package com.galgit.healthcare;

import com.galgit.healthcare.entities.Etudiant;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainModif {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("ing2Pu");
        EntityManager em = emf.createEntityManager();

        int id=5;
        Etudiant e=em.find(Etudiant.class, id);
        System.out.println("etudiant dont l'id est "+id+" est "+e);
        e.setPrenom("Abdoulaye");

        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}