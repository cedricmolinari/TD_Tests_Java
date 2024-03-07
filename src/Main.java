import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        /* Exercice 1

Écrire deux tests unitaires par fonctions développées dans le TD sur les fonctions. (Un avec assertEquals, un avec
assertNotEquals) */

    }
    public static long carreNombre(int nombre) {
        return (long) nombre * nombre;
    }

    public static int nombrePlusGrand(int a, int b) {
        IntStream nombres = IntStream.of(a, b);
        return nombres.max().getAsInt();
    }

    public static int sommeTableau(int... nombres) {
        return IntStream.of(nombres)
                .sum();
    }

    /*
Exercice 2
Couvrir l’ensemble des fonctions (getters + setters + toString) de l’exercice sur les Personnes avec des tests unitaires.
Exercice 3
Écrivez un programme qui imprime les nombres de 1 à 100. Mais pour les multiples de trois, imprimez "Fizz" à la place du nombre et pour les multiples de cinq, imprimez "Buzz". Pour les nombres qui sont à la fois multiples de trois et de cinq, imprimez "FizzBuzz".

Passez par une fonction qui génère la chaîne de caractères à renvoyer.

Résultat attendu :

1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
…


Faites un test unitaire pour tester cette fonction.

Exercice 4
Créer une méthode qui prend une chaîne et un dictionnaire, et remplace chaque clé du dictionnaire précédée et suffixée par un signe dollar, par la valeur correspondante du dictionnaire.

exemple d’input : “{{temp}} here comes the name {{name}}”, dict [“temp”, “temporary”] [“name”, “John Doe”]

output : “temporary here comes the name John Doe”

Effectuer le test unitaire de chaque fonction développée

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
