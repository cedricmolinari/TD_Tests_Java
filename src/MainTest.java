import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testCarreNombre() {
        assertEquals(4, Main.carreNombre(2), "Doit être égal à son carré");
        assertNotEquals(2, Main.carreNombre(2), "Ne doit pas être égal à lui-même");
    }
    @Test
    public void testNombrePlusGrand() {
        assertEquals(10, Main.nombrePlusGrand(5, 10),
                "Doit choisir le nombre le plus grand");
        assertNotEquals(2, Main.nombrePlusGrand(1, -2),
                "Ne doit pas choisir le plus grand en valeur absolu");
    }
    @Test
    public void testSommeTableau() {
        assertEquals(30, Main.sommeTableau(6, 6, 18),
                "Doit être égal à la somme de tous les arguments de la fonction");
        assertNotEquals(0, Main.sommeTableau(-2, -2),
                "Ne doit pas être erroné en cas d'addition de nombres négatifs");
    }
}
