package fr.diginamic.banque.entites;

// Je définis ici la classe Debit qui hérite également de la classe parente Operation
public class Debit extends Operation {
    // Je crée le constructeur pour initialiser un débit avec sa date et son montant
    public Debit(String dateDeLoperation, double montantDeLoperation) {
        // J'appelle le constructeur de la classe parente (Operation) pour lui transmettre ces données
        super(dateDeLoperation, montantDeLoperation);
    }

    // Je redéfinis la méthode getType pour que cet objet exécute son propre code
    @Override
    public String getType() {
        // Je retourne spécifiquement la chaîne "DEBIT" propre à cette classe fille
        return "DEBIT";
    }
}
