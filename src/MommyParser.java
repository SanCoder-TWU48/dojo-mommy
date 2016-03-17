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
        for (int i = 0; i < inputChars.length; i++) {
            if (Arrays.asList(VOWELS).contains(inputChars[i].toLowerCase())) {
                output += MOMMY_STRING;
            } else {
                output += inputChars[i];
            }
        }
        return mommySinglefy(output);
    }

    private String mommySinglefy(String input) {
        if (input.contains(MOMMY_STRING + MOMMY_STRING))
            return mommySinglefy(input.replace(MOMMY_STRING+MOMMY_STRING, MOMMY_STRING));
        else
            return input;
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
