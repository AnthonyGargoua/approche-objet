package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale a1 = new AdressePostale(7, "Rue de la Paix", "34000", "Montpellier");
        // Je reprends toutes mes classes créées auparavant

        Personne p1 = new Personne("GARGOUA", "Anthony", a1);
        // Je reprends toutes mes classes créées auparavant

        AdressePostale a2 = new AdressePostale(15, "Rue de la Gloire", "34000", "Toulouse");
        // Je reprends toutes mes classes créées auparavant

        Personne p2 = new Personne("DUPONT", "Tintin", a2);
        // Je reprends toutes mes classes créées auparavant
    }
} 