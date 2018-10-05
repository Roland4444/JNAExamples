import com.sun.jna.Pointer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoaderSummwPointersTest {

    @Test
    void summwPointersCall() {
        LoaderSummwPointers obj = new LoaderSummwPointers();
        int a=6;
        int b= 8;
        assertEquals(obj.simpleSummCall(5,8), 13);
        assertNotEquals(obj.simpleSummCall(5,8), 17);
    }

    Pointer getPointer(int input){
        Pointer ptr = new Pointer();

    }
}