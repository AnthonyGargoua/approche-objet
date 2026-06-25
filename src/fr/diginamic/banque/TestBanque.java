package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;
import org.w3c.dom.ls.LSOutput;

// j'importe la classe Compte par elle se trouve dans l'autre fichier (Compte.java)

public class TestBanque {
    public static void main(String[] args) {
        // Je crée l'objet
        //Compte compteBancaire = new Compte("123456789", 10000); // Plus besoin car on crée un seul compte

        // J'appelle le toString() de Compte
        //System.out.println(compteBancaire); // Plus besoin d'afficher cela car on crée un seul compte

        Compte compteNormal = new Compte("FR123456789", 1000);
        CompteTaux compteEpargne = new CompteTaux("FR637382822", 1000.0, 2.80);

        Compte[] listeComptes = new Compte[2];
        listeComptes[0] = compteNormal;
        listeComptes[1] = compteEpargne; // Autorisé car compteEpargne est aussi un Compte

        for (int i = 0; i < listeComptes.length; i++) {
            System.out.println(listeComptes[i]);
        }
    }
}