import org.junit.Test;

import static org.junit.Assert.*;

public class callSummTest {

    @Test
    public void call_summ() {
        callSumm cs = new callSumm();
        assertEquals(4, cs.call_summ(2,2));
    }
}