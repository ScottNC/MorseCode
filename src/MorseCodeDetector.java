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

                String decodedWord = decodeWord(word);

                if (decodedWord == null) {
                    return null;
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
                Character decodedLetter = MorseCode.get(letter);

                if (decodedLetter == null) {
                    return null;
                }

                decodedWord.append(decodedLetter);
            }
        }

        return decodedWord.toString();
    }
}
