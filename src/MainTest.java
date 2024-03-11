import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    static Map<String, String> remplacements = new HashMap<>();
    static {
        remplacements.put("temp", "temporary");
        remplacements.put("name", "John Doe");
    }

    @Test
    public void testTraitementTexte() {
        assertEquals("temporary here comes the name John Doe",
                Main.traitementTexte("$temp$ here comes the name $name$", remplacements));
    }
}
