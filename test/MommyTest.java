import org.junit.*;
import static org.junit.Assert.*;

public class MommyTest {

    private MommyParser parser;

    @Before
    public void setUp() throws Exception {
        parser = new MommyParser();
    }

    @Test
    public void shouldBeAbleToReturnOnlyConsonantsGivenOnlyOneConsonant() throws Exception {
        String mommyString = parser.stringParser("h");
        assertEquals("h", mommyString);
    }

    @Test
    public void shouldBeAbleToReturnMommyGivenOnlyOneVowel() throws Exception {
        String mommyString = parser.stringParser("a");
        assertEquals("mommy", mommyString);
    }

    @Test
    public void shouldBeAbleToReturnTheInputGivenAnStringWithVowelLessThan30Percent() throws Exception {
        String mommyString = parser.stringParser("hard");
        assertEquals("hard", mommyString);
    }

    @Test
    public void shouldBeAbleToReturnMommyGivenOnlyOneVowelWithUppercase() throws Exception {
        String mommyString = parser.stringParser("A");
        assertEquals("mommy", mommyString);
    }

    @Test
    public void shouldBeAbleToReturnOneMommyGivenAnStringWithOneVowelWith50Percent() throws Exception {
        String mommyString = parser.stringParser("ah");
        assertEquals("mommyh", mommyString);
    }
}
