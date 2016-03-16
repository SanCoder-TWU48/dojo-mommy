public class MommyParser {

    private static final String MOMMY_STRING = "mommy";
    private static final char[] VOWELS = new char[]{'a', 'e', 'i', 'o', 'u'};


    public String stringParser(String input) {

        if (isVowelInclude(input)) {
            return input.replace(,MOMMY_STRING);
        }

        return input;
    }

    private boolean isVowelInclude(String input) {
        int vowelCount = 0;
        for (char inputChar : input.toLowerCase().toCharArray()) {
            for (char vowel : VOWELS) {
                if (inputChar == vowel) {
                    vowelCount++;
                }
            }
        }

        int percent = (100 * vowelCount) / input.length();

        return percent >= 30;

    }

}
