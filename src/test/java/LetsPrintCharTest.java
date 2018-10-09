import org.junit.Test;

import static org.junit.Assert.*;

public class LetsPrintCharTest {

    @Test
    public void call_letsprintCharPtr() {
        LetsPrintChar cl = new LetsPrintChar();
        assertEquals(cl.call_letsprintCharPtr("wow"), "wow");

    }
}