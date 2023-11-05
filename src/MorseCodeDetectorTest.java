import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeDetectorTest {

    @Test
    void decode() {
        assertEquals(MorseCodeDetector.decode(".... . -.--   .--- ..- -.. ."), "HEY JUDE");
        assertEquals(MorseCodeDetector.decode(" .... . .-.. .-.. ---"), "HELLO");
        assertEquals(MorseCodeDetector.decode(" .  ."), "E E");
        assertNull(MorseCodeDetector.decode(".---.."));
    }
}