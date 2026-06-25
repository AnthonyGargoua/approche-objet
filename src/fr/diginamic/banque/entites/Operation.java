package fr.diginamic.banque.entites;

public abstract class Operation {
    protected String dateDeLoperation;
    protected double montantDeLoperation;

    public Operation(String dateDeLoperation, double montantDeLoperation) {
        this.dateDeLoperation = dateDeLoperation;
        this.montantDeLoperation = montantDeLoperation;
    }
    public abstract String getType();
}
