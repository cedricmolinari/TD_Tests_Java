import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        /*
        Exercice 4
Créer une méthode qui prend une chaîne et un dictionnaire, et remplace chaque clé du dictionnaire précédée et
suffixée par un signe dollar, par la valeur correspondante du dictionnaire.

exemple d’input : “{{temp}} here comes the name {{name}}”, dict [“temp”, “temporary”] [“name”, “John Doe”]

output : “temporary here comes the name John Doe”

Effectuer le test unitaire de chaque fonction développée
         */
        Map<String, String> remplacements = new HashMap<>();
        remplacements.put("temp", "temporary");
        remplacements.put("name", "John Doe");

        System.out.println(traitementTexte("$temp$ here comes the name $name$", remplacements));
    }

    public static String traitementTexte(String input, Map<String, String> dictionnaires) {
        Pattern pattern = Pattern.compile("\\$(.+?)\\$");
        Matcher matcher = pattern.matcher(input);

        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            String key = matcher.group(1);

            String dictionnaire = dictionnaires.get(key);

            if (dictionnaire != null) {
                matcher.appendReplacement(result, dictionnaire);
            }
        }
        matcher.appendTail(result);
        return result.toString();
    }



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

Conseils : Développer cette fonction à l’aide du TDD et de babySteps(très petites étapes par étapes)

écrivez un test : doitConvertir1EnI
faite en sorte que le test passer au vert
écrivez un test : doitConvertir2EnII
faites en sorte que le test passe au vert
etc…. */
}
