import org.junit.Test;

import static org.junit.Assert.*;

public class simplePrintTest {

    @Test
    public void callprintChar() {
        simplePrint sp = new simplePrint();
        assertEquals(5, sp.callprintInt(5));
    }
}