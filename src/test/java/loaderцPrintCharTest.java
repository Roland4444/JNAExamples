import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class loaderцPrintCharTest {

    @Test
    void callwprintChar() {
        loaderwPrintChar lc =  new loaderwPrintChar();
        String test = "####";
        assertEquals(4, lc.callwprintChar(lc.getPointerStr(test)));
    }
}