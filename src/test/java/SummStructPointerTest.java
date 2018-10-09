import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SummStructPointerTest {

    @Test
    public void TestPointerStruct(){
        SummStructPointer sss = new SummStructPointer();
        SummStructPointer.CLibrary.input inp = new  SummStructPointer.CLibrary.input();
        inp.a=6;
        inp.b=11;
        assertEquals(17, (int) SummStructPointer.CLibrary.INSTANCE.structSummPointer(inp));
    }

}