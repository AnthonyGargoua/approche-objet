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


        // Instanciation d'un nouvel objet AdressePostale pour la ville de Chambéry
        AdressePostale adresseChambery = new AdressePostale(15, "Rue des lilas", "73000", "Chambéry");

        // Utilisation du nouveau constructeur pour valoriser UNIQUEMENT le nom et le prénom de la personne
        Personne p3 = new Personne("MARTIN", "Lutter");

        // Utilisation du 'setter' (méthode de modification) pour attribuer l'adresse postale à la personne
        p3.setAdressePostale(adresseChambery);

        // Appel de la méthode afficher() pour vérifier la bonne saisie des informations de la personne
        p3.afficher();
    }
}