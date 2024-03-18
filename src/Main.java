import com.sun.jdi.Value;
import org.w3c.dom.ls.LSOutput;

import java.lang.invoke.StringConcatFactory;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        /*
        Exercice 5

        Partie 1 : Créer une fonction qui convertir un entier en chiffre romain (nombre <= 100)
        I = 1
        IV = 4
        VII = 7
        X = 10
        L = 50
        XCIX = 99
        C = 100
         */

        System.out.println(convertirEnChiffresRomains(9));

    }
    public static String convertirEnChiffresRomains(int nombre) throws InputMismatchException {
        String chiffreRomain;
        int nombreRestant;
        int nombreRestantBis;
        int nombreRestantTer;
        int premierChiffreResultat;
        double resultat;
        String strResultat;
        String nbDizaines;
        String nbUnites;

        if (nombre % 100 == 0) {
            chiffreRomain = "C";
        } else if (nombre % 50 < nombre) { // ne concerne que les nombres > 50
            resultat = (double) nombre / 50; // combien de fois 50 ?
            if (resultat == 1) {
                chiffreRomain = "L"; //si pile une fois
            } else {
                nombreRestant = nombre - 50; //sinon quel nombre reste à générer après L
                if (nombreRestant % 10 < nombreRestant) { // si le restant est > à 10
                    resultat = (double) nombreRestant / 10; // combien de fois 10 ?
                    strResultat = String.valueOf(resultat);
                    premierChiffreResultat = Character.getNumericValue(strResultat.charAt(0));
                    nbDizaines = IntStream.range(0, premierChiffreResultat)
                            .mapToObj(i -> "X")
                            .collect(Collectors.joining());
                    chiffreRomain = (nbDizaines.equals("XXXX")) ? "XC" : "L" + nbDizaines;
                    nombreRestantBis = nombreRestant - (premierChiffreResultat * 10);
                    if (nombreRestantBis % 5 < nombreRestantBis) {
                        nombreRestantTer = nombreRestantBis - 5;
                        nbUnites = IntStream.range(0, nombreRestantTer)
                                .mapToObj(i -> "I")
                                .collect(Collectors.joining());
                        chiffreRomain = (nbUnites.equals("IIII")) ? chiffreRomain + "IX" : chiffreRomain + "V" + nbUnites;
                    } else {
                        nbUnites = IntStream.range(0, nombreRestantBis)
                                .mapToObj(i -> "I")
                                .collect(Collectors.joining());
                        chiffreRomain = (nbUnites.equals("IIII")) ? chiffreRomain + "IV" : chiffreRomain + nbUnites;
                    }
                } else {
                    if (nombreRestant % 5 < nombreRestant) {
                        nombreRestantBis = nombreRestant - 5;
                        nbUnites = IntStream.range(0, nombreRestantBis)
                                .mapToObj(i -> "I")
                                .collect(Collectors.joining());
                        chiffreRomain = (nbUnites.equals("IIII")) ? "L" + "IX" : "L" + "V" + nbUnites;
                    } else {
                        nbUnites = IntStream.range(0, nombreRestant)
                                .mapToObj(i -> "I")
                                .collect(Collectors.joining());
                        chiffreRomain = (nbUnites.equals("IIII")) ? "LIV" : "L" + nbUnites;
                    }
                }
            }
        } else if (nombre % 10 < nombre) {
            resultat = (double) nombre / 10;
            strResultat = String.valueOf(resultat);
            nbDizaines = IntStream.range(0, Character.getNumericValue(strResultat.charAt(0)))
                    .mapToObj(i -> "X")
                    .collect(Collectors.joining());
            chiffreRomain = (nbDizaines.equals("XXXX")) ? "XL" : nbDizaines;
            nombreRestant = nombre - Character.getNumericValue(strResultat.charAt(0)) * 10;
            if (nombreRestant % 5 < nombreRestant) {
                nombreRestantBis = nombreRestant - 5;
                nbUnites = IntStream.range(0, nombreRestantBis)
                        .mapToObj(i -> "I")
                        .collect(Collectors.joining());
                chiffreRomain = (nbUnites.equals("IIII")) ? chiffreRomain + "IX" : chiffreRomain + "V" + nbUnites;
            } else {
                nbUnites = IntStream.range(0, nombreRestant)
                        .mapToObj(i -> "I")
                        .collect(Collectors.joining());
                chiffreRomain = (nbUnites.equals("IIII")) ? chiffreRomain + "IV" : chiffreRomain + nbUnites;
            }

        } else if (nombre % 5 < nombre) {
            nombreRestant = nombre - 5;
            nbUnites = IntStream.range(0, nombreRestant)
                    .mapToObj(i -> "I")
                    .collect(Collectors.joining());
            chiffreRomain = (nbUnites.equals("IIII")) ? "IX" : "V" + nbUnites;
        } else {
            nbUnites = IntStream.range(0, nombre)
                    .mapToObj(i -> "I")
                    .collect(Collectors.joining());
            chiffreRomain = (nbUnites.equals("IIII")) ? "IV" : nbUnites;
        }

        return chiffreRomain;

    }
}
