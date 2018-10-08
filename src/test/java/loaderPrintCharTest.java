import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class loaderPrintCharTest {
    Pointer getPointerStr(String input) {
        Pointer pointer = new Memory(input.length()+1);
        pointer.setString(0, input);
        return pointer;
    }

    @Test
    void callprintChar() {
        loaderPrintChar lc =  new loaderPrintChar();
        String test = "####";
        assertEquals(4, lc.callprintChar(getPointerStr(test)));
    }
}