package entites;

import entites2.Personne;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale a1 = new AdressePostale();
        a1.numero = 7;
        a1.libelleRue = "Rue de la Paix";
        a1.codePostaux = "34000";
        a1.villes = "Montpellier";
        // Je reprends toutes mes classes créées auparavant

        Personne p1 = new Personne();
        p1.nom = "GARGOUA";
        p1.prenom = "Anthony";
        p1.adressePostale = a1; // J'associe l'adresse a1 défini plus haut.
        // Je reprends toutes mes classes créées auparavant

        AdressePostale a2 = new AdressePostale();
        a2.numero = 15;
        a2.libelleRue = "Rue de la Gloire";
        a2.codePostaux = "31000";
        a2.villes = "Toulouse";
        // Je reprends toutes mes classes créées auparavant

        Personne p2 = new Personne();
        p2.nom = "DUPONT";
        p2.prenom = "Tintin";
        p2.adressePostale = a2; // J'associe l'adresse a2 défini plus haut.
        // Je reprends toutes mes classes créées auparavant

        }
    }