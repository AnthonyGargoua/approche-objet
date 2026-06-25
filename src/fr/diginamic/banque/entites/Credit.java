package fr.diginamic.banque.entites;

public class Credit extends Operation {
    public Credit(String dateDeLoperation, double montantDeLoperation) {
        super(dateDeLoperation, montantDeLoperation);
    }

    @Override
    public String getType() {
        return "CREDIT";
    }
}
