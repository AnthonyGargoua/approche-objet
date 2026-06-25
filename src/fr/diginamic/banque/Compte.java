package fr.diginamic.banque;

public class Compte {

    // Je crée mes attributs privés
    private String numeroDeCompte;
    private int soldeDuCompte;

    // Je crée mon constructeur
    public Compte(String numeroDeCompte, int soldeDuCompte){
        this.numeroDeCompte = numeroDeCompte;
        this.soldeDuCompte = soldeDuCompte;
    }

    // Je crée la méthode toString() pour l'affichage
    @Override
    public String toString(){
        return "Compte N° " + this.numeroDeCompte + " - Solde: " + this.soldeDuCompte + "€";
    }
}