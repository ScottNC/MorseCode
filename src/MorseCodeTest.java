import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {

    @Test
    void get() {
        assertEquals(MorseCode.get(".-"), 'A');
        assertEquals(MorseCode.get("-..."), 'B');
        assertNull(MorseCode.get(" "));
    }
}