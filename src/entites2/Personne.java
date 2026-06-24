package entites2;

import entites.AdressePostale;
import entites.TestAdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adressePostale;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adressePostale) { // Je déclare ici toutes mes infos
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }

    // Méthode permettant d'afficher l'identité de la personne (Prénom + NOM en majuscules)
    public void afficher(){
        System.out.println(prenom + " " + nom.toUpperCase());
    }

    // SETTERS (Modification)
    // Méthode 'void qui permet de modifier le nom de la personne
    public void setNom(String nouveauNom){
        this.nom = nouveauNom;
    }

    // Méthode 'void' permettant de modifier le prénom de la personne
    public void setPrenom(String nouveauPrenom){
        this.prenom = nouveauPrenom;
    }

    // Méthode 'void' prenant en paramètre une AdressePostale pour modifier l'adresse de la personne
    public void setAdressePostale(AdressePostale adressePostale){
        this.adressePostale = adressePostale;
    }

    // GETTERS (Retourner des valeurs)
    // Méthode permettant de retourner le nom de la personne (Type: String)
    public String getNom(){
        return this.nom;
    }

    // Méthode permettant de retourner le prénom de la personne (Type: String)
    public String getPrenom(){
        return this.prenom;
    }

    // Méthode permettant de retourner l'adresse de la personne (Type: AdressePostale)
    public AdressePostale getAdressePostale() {
        return this.adressePostale;
    }
}