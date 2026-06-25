package fr.diginamic.banque.entites;

public class Compte {

    // Je crée mes attributs privés
    private String numeroDeCompte;
    private int soldeDuCompte;

    // Je crée mon constructeur
    public Compte(String numeroDeCompte, int soldeDuCompte) {
        this.numeroDeCompte = numeroDeCompte; // j'appelle la variable numeroDeCompte qui est égale à la variable numeroDeCompte
        this.soldeDuCompte = soldeDuCompte; // j'appelle la variable soldeDuCompte qui est égale à la variable soldeDuCompte
    }

    // Je crée la méthode toString() pour l'affichage
    @Override
    public String toString() {
        return "Compte N° " + this.numeroDeCompte + " - Solde: " + this.soldeDuCompte + "€";
    }

    // Mes GETTERS et SETTERS

    // Je récupère le numeroDeCompte
    public String getNumeroDeCompte() {
        return numeroDeCompte;
    }

    // Je modifie le numeroDeCompte
    public void setNumeroDeCompte(String numeroDeCompte) {
        this.numeroDeCompte = numeroDeCompte;
    }

    // Je récupère le soldeDuCompte
    public int getSoldeDuCompte() {
        return soldeDuCompte;
    }

    // Je modifie le soldeDuCompte
    public void setSoldeDuCompte(int soldeDuCompte) {
        this.soldeDuCompte = soldeDuCompte;
    }
}