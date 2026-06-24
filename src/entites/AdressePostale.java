package entites;

public class AdressePostale {
    public int numero;
    public String libelleRue;
    public String codePostaux;
    public String villes;

    public AdressePostale(int numero, String libelleRue, String codePostaux, String villes) {
        // Je déclare ici toutes mes infos
        this.numero = numero; // Mon attribut numero reçoit le paramètre numero
        this.libelleRue = libelleRue; // Mon attribut libelleRue reçoit le paramètre libelleRue
        this.codePostaux = codePostaux; // Mon attribut codePostaux reçoit le paramètre codePostaux
        this.villes = villes; // Mon attribut villes reçoit le paramètre villes
    }
}