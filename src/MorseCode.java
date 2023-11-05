import java.util.HashMap;
import java.util.Map;

public class MorseCode {
    public static Character get(String morse) {
        Map<String, Character> morseMap = new HashMap<>();

        char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        String[] morseLetters = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
                ".--", "-..-", "-.--", "--.."
        };

        for (int i = 0; i < letters.length; i++) {
            morseMap.put(morseLetters[i], letters[i]);
        }

        return morseMap.get(morse);
    }
}
