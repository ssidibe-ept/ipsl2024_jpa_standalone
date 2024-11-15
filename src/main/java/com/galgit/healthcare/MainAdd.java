package com.galgit.healthcare;

import com.galgit.healthcare.entities.Etudiant;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainAdd {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("ing2Pu");
        EntityManager em = emf.createEntityManager();

        Etudiant e1 = new Etudiant();
        e1.setId(5);
        e1.setPrenom("Abdou");
        e1.setNom("Ba");
        e1.setEmail("aba2024@ugb.edu.sn");


        Etudiant e2 = new Etudiant();
        e2.setId(3);
        e2.setPrenom("Aminata");
        e2.setNom("Ba");
        e2.setEmail("aminaba2024@ugb.edu.sn");

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //enregistrement
        em.persist(e1);
        em.persist(e2);



        tx.commit();
        em.close();
        emf.close();
    }
}