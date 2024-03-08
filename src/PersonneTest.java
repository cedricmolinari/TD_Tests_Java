import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonneTest {
    private Personne personne;
    @BeforeEach
    public void setUp() {
        personne = new Personne("Molinari", "Cédric", 39);
    }

    @Test
    public void testGetNom() {
        assertEquals("Molinari", personne.getNom());
    }
    @Test
    public void testSetNom() {
        personne.setNom("Dupont");
        assertEquals("Dupont", personne.getNom());
    }
    @Test
    public void testGetPrenom() {
        assertEquals("Cédric", personne.getPrenom());
    }
    @Test
    public void testSetPrenom() {
        personne.setPrenom("Jonathan");
        assertEquals("Jonathan", personne.getPrenom());
    }
    @Test
    public void testGetAge() {
        assertEquals(39, personne.getAge());
    }
    @Test
    public void testSetAge() {
        personne.setAge(20);
        assertEquals(20, personne.getAge());
        assertThrows(IllegalArgumentException.class, () -> {
            personne.setAge(-1);
        }, "Devrait lancer une IllegalArgumentException pour un âge négatif.");
    }

    @Test
    public void testToString() {
        assertEquals("Cette personne se nomme Molinari Cédric et elle est âgée de 39 ans.", personne.toString());
        Personne cedric = new Personne("Molinari", "Cédric", -39);
        assertEquals( "Cette personne se nomme Molinari Cédric et âge inconnu.", cedric.toString(),
                "L'âge de la personne ne peut pas être négatif.");
    }
}
