package entites2;

import entites.AdressePostale;
import entites.TestAdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adressePostale;

    public Personne(String nom, String prenom, AdressePostale adressePostale) { // Je déclare ici toutes mes infos
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }
}