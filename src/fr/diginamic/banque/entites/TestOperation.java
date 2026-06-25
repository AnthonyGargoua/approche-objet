package fr.diginamic.banque.entites;

// Je définis la classe de test pour exécuter mon programme bancaire
public class TestOperation {
    // Je crée la méthode principale, point d'entrée de mon application
    public static void main(String[] args) {
        // Je déclare et j'initialise un tableau qui contient un mélange de crédits et de débits
        Operation[] tableauOperation = {
                new Credit("01/03/2026", 3000.00),
                new Debit("15/06/2025", 4500.00),
                new Credit("07/07/2026", 4000.00),
                new Debit("22/08/2026", 3500.00)
        };
        // J'initialise ma variable pour calculer le solde final (Je pars de 1 €)
        double montantGlobal = 1;

        // Je parcours chaque opération du tableau une par une
        for (Operation operation : tableauOperation) {
            // J'affiche les détails de l'opération en profitant du polymorphisme pour le getType()
            System.out.println("Date : " + operation.dateDeLoperation + " - Montant : " + operation.montantDeLoperation + " € " + operation.getType());

            // Je vérifie si l'opération courante est un crédit
            if (operation.getType().equals("CREDIT")) {
                // J'ajoute le montant au montant global s'il s'agit d'un crédit
                montantGlobal = montantGlobal + operation.montantDeLoperation;
                // Sinon, je vérifie si c'est un débit
            } else if (operation.getType().equals("DEBIT")) {
                // Je soustrais le montant du montant global s'il s'agit d'un débit
                montantGlobal = montantGlobal - operation.montantDeLoperation;
            }
        }
        // J'affiche le résultat final du calcul dans la console
        System.out.println("Le montant global de toutes les opérations est de : " + montantGlobal + " € ");
    }
}
