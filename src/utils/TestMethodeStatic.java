package utils;

public class TestMethodeStatic {

    public static void main(String[] args) {

        // Je déclare une chaîne contenant un nombre entier
        String chaine = "12";

        // Je convertis la chaîne en entier (Méthode static juste au dessus)
        int nombreConverti = Integer.parseInt(chaine);

        // Je déclare deux variables int a et b
        int a = 42;
        int b = 27;

        // Je calcul le maximum entre a et b (Méthode static juste au dessus)
        int maximum = Integer.max(a, b);

        // J'affiche le résultat
        System.out.println("Le maximum entre " + a + " et " + b + " est : " + maximum);

        // J'affiche le résultat de l'appel de cette méthode
        System.out.println("Le nombre converti est : " + nombreConverti);
    }
}