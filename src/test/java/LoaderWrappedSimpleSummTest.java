import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoaderWrappedSimpleSummTest {

    @Test
    void summwPointersCall() {
        LoaderWrappedSimpleSumm lwss = new LoaderWrappedSimpleSumm();
        assertEquals(16, lwss.callwSimpleSumm(8, 8));
        assertNotEquals(11, lwss.callwSimpleSumm(18, 8));
    }
}