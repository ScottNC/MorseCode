import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeDetectorTest {

    @Test
    void decode() {
        assertEquals(MorseCodeDetector.decode(".... . -.--   .--- ..- -.. ."), "HEY JUDE");
    }
}