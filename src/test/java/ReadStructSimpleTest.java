import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ReadStructSimpleTest {
    @Test
    public void sendSimpleStruct(){
        SendSimpleStruct sss = new SendSimpleStruct();
        SendSimpleStruct.CLibrary.input inp = new  SendSimpleStruct.CLibrary.input();
        inp.a=6;
        inp.b=11;
        assertEquals(17, (int) SendSimpleStruct.CLibrary.INSTANCE.structSumm(inp));
    }
}