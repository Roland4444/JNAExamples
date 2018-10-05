import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoaderSimpleSummTest {

    @Test
    void simpleSummCall() {
        LoaderSimpleSumm obj = new LoaderSimpleSumm();
        assertEquals(obj.simpleSummCall(5,8), 13);
        assertNotEquals(obj.simpleSummCall(5,8), 17);
    }
}