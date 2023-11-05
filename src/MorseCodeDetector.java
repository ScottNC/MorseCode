public class MorseCodeDetector {
    public static String decode(String morseCode) {

        String[] morseWords = morseCode.split(" {2}");
        StringBuilder decodedPhrase = new StringBuilder();

        boolean firstWord = true;

        for (String word: morseWords) {
            if (!word.isEmpty()) {
                if (!firstWord) {
                    decodedPhrase.append(" ");
                }
                else {
                    firstWord = false;
                }
                decodedPhrase.append(decodeWord(word));
            }
        }

        return decodedPhrase.toString();
    }

    private static String decodeWord(String word) {
        String[] morseArray = word.split(" ");

        StringBuilder decodedWord = new StringBuilder();

        for (String letter: morseArray) {
            if (!letter.isEmpty()) {
                decodedWord.append(MorseCode.get(letter));
            }
        }

        return decodedWord.toString();
    }
}
