package fr.diginamic.banque;
import fr.diginamic.banque.entites.Compte;

// j'importe la classe Compte par elle se trouve dans l'autre fichier (Compte.java)

public class TestBanque {
    public static void main(String[] args) {
        // Je crée l'objet
        Compte compteBancaire = new Compte("123456789", 10000);

        // J'appelle le toString() de Compte
        System.out.println(compteBancaire);
    }
}