package fr.diginamic.banque.entites;

public class Debit extends Operation {
    public Debit(String dateDeLoperation, double montantDeLoperation) {
        super(dateDeLoperation, montantDeLoperation);
    }

    @Override
    public String getType() {
        return "DEBIT";
    }
}
