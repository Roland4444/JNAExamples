import org.junit.Test;

import static org.junit.Assert.*;

public class callCplplStructTest {

    @Test
    public void testSumm(){
        callCplplStruct cl = new callCplplStruct();
        assertEquals(cl.call_cpluplus_summ(7,8),15);
    }

    @Test
    public void callLetsSumm() {
        callCplplStruct cl = new callCplplStruct();
        callCplplStruct.CLibrary.inputStruct inp = new callCplplStruct.CLibrary.inputStruct();
        inp.a=7;
        inp.b=8;
        callCplplStruct.CLibrary.resultStruct res = cl.callLetsSumm(inp);
        assertEquals(res.result, 15);

    }
}