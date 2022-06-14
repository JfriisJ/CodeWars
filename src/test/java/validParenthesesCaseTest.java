import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class validParenthesesCaseTest {

    @Test
    public void testValidParentheses() {
        // assertEquals("expected", "actual");
        assertEquals(true,validParenthesesCase.validParentheses( "()" ));
        assertEquals(false,validParenthesesCase.validParentheses( "())" ));
        assertEquals(true,validParenthesesCase.validParentheses( "32423(sgsdg)" ));
        assertEquals(false,validParenthesesCase.validParentheses( "(dsgdsg))2432" ));
        assertEquals(true,validParenthesesCase.validParentheses( "adasdasfa" ));
        assertEquals(false,validParenthesesCase.validParentheses( "Sy>E).)Bj((X3+8-s|/" ));
        assertEquals(false,validParenthesesCase.validParentheses( "())(" ));

    }


}