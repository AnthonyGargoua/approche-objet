package fr.diginamic.banque.entites;

// Je déclare une classe abstraite : elle sert de modèle et je ne peux pas l'instancier directement
public abstract class Operation {
    // Je définis les attributs accessibles par mes classes filles grâce au mot-clé protected
    protected String dateDeLoperation;
    protected double montantDeLoperation;

    // Je crée le constructeur de ma classe parente pour attribuer les valeurs communes
    public Operation(String dateDeLoperation, double montantDeLoperation) {
        this.dateDeLoperation = dateDeLoperation;
        this.montantDeLoperation = montantDeLoperation;
    }
    // Je déclare une méthode abstraite sans corps (sans bloc de code) : j'oblige toutes mes classes filles à implémenter (redéfinir) leur propre méthode getType()
    public abstract String getType();
}
