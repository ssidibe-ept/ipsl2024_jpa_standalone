package com.galgit.healthcare;

import com.galgit.healthcare.entities.Carte;
import com.galgit.healthcare.entities.Etudiant;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainRelations {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("ing2Pu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        int anneeDebut=2024;
        int anneeFin=2025;
        Etudiant ali=new Etudiant("Ali", "Dieng", "adieng@ugb.sn");
        Carte aliCarte=new Carte(anneeDebut,anneeFin);
        ali.setCarte(aliCarte);

        Etudiant fatou=new Etudiant("Fatou", "Faye", "ffaye@ugb.sn");
        Etudiant saliou=new Etudiant("Saliou", "Diallo", "sdiallo@ugb.sn");
        Etudiant soukey=new Etudiant("Soukeyna", "Fall", "sfall@ugb.sn");


        em.persist(ali);
        //em.persist(fatou);
        //em.persist(saliou);
        //em.persist(soukey);


        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}