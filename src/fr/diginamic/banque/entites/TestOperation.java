package fr.diginamic.banque.entites;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] tableauOperation = {
                new Credit("01/03/2026", 3000),
                new Debit("15/06/2025", 4500),
                new Credit("07/07/2026", 4000),
                new Debit("22/08/2026", 3500)
        };
        double montantGlobal = 1;

        for (Operation operation : tableauOperation) {
            System.out.println("Date : " + operation.dateDeLoperation + " - Montant : " + operation.montantDeLoperation + " € " + operation.getType());

            if (operation.getType().equals("CREDIT")) {
                montantGlobal = montantGlobal + operation.montantDeLoperation;
            } else if (operation.getType().equals("DEBIT")) {
                montantGlobal = montantGlobal - operation.montantDeLoperation;
            }
        }
        System.out.println("Le montant global de toutes les opérations est de : " + montantGlobal + " € ");
    }
}
