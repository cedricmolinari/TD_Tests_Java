import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testDeterminerFizz() {
        assertEquals("Fizz", Main.determinerFizzBuzz(3));
        assertEquals("Fizz", Main.determinerFizzBuzz(6));
    }
    @Test
    void testDeterminerBuzz() {
        assertEquals("Buzz", Main.determinerFizzBuzz(5));
        assertEquals("Buzz", Main.determinerFizzBuzz(10));
    }
    @Test
    void testDeterminerFizzBuzz() {
        assertEquals("FizzBuzz", Main.determinerFizzBuzz(15));
        assertEquals("FizzBuzz", Main.determinerFizzBuzz(30));
    }
    @Test
    void testDeterminerNombre() {
        assertEquals("1", Main.determinerFizzBuzz(1));
        assertEquals("7", Main.determinerFizzBuzz(7));
    }
}
