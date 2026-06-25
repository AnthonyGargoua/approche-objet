package fr.diginamic.banque.entites;

public class CompteTaux extends Compte { // J'indique que la classe CompteTaux est une classe enfant de la class Compte
    private double tauxDeRemuneration;

    public CompteTaux(String numeroDeCompte, double soldeDuCompte, double tauxDeRemuneration) {
        super(numeroDeCompte, soldeDuCompte);
        this.tauxDeRemuneration = tauxDeRemuneration;
    }

    @Override
    public String toString() {
        return super.toString() + " - Votre taux de rémunération est : " + tauxDeRemuneration + "%";
    }

    public double getTauxDeRemuneration() {
        return tauxDeRemuneration;
    }

}
