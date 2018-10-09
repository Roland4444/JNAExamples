import org.junit.Test;

import static org.junit.Assert.*;

public class callsimpleCPlusplusTest {

    @Test
    public void call_cpluplus_summ() {
        callsimpleCPlusplus obj = new callsimpleCPlusplus();
        assertEquals(12, obj.call_cpluplus_summ(9,3));
    }

    @Test
    public void call_cpluplus_summ__() {
        callsimpleCPlusplus obj = new callsimpleCPlusplus();
        assertEquals(12, obj.call_cpluplus_summ(9,3));
    }
}