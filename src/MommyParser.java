import java.util.Arrays;

public class MommyParser {

    private static final String MOMMY_STRING = "mommy";
    private static final String[] VOWELS = new String[]{"a", "e", "i", "o", "u"};


    public String stringParser(String input) {

        if (!isVowelEnough(input)) {
            return input;
        }
        String[] inputChars = input.split("");
        String output = "";
        for (String inputChar : inputChars) {
            output += Arrays.asList(VOWELS).contains(inputChar.toLowerCase()) ? MOMMY_STRING : inputChar;
        }
        return output;
    }

    private boolean isVowelEnough(String input) {
        int vowelCount = 0;
        for (char inputChar : input.toLowerCase().toCharArray()) {
            for (String vowel : VOWELS) {
                if (vowel.equals(Character.toString(inputChar))) {
                    vowelCount++;
                }
            }
        }

        int percent = (100 * vowelCount) / input.length();

        return percent >= 30;

    }

}
