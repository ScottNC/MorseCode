public class MorseCodeDetector {
    public static String decode(String morseCode) {
        String[] morseArray = morseCode.split(" ");

        StringBuilder decodedPhrase = new StringBuilder();

        boolean previousIsEmpty;
        previousIsEmpty = false;

        for (String word: morseArray) {
            if (word.isEmpty()) {
                if (!previousIsEmpty) {
                    previousIsEmpty = true;
                    decodedPhrase.append(" ");
                }
                else {
                    previousIsEmpty = false;
                }
            }
            else {
                decodedPhrase.append(MorseCode.get(word));
                previousIsEmpty = false;
            }
        }

        return decodedPhrase.toString();
    }
}
