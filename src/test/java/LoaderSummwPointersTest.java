import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoaderSummwPointersTest {

    @Test
    void summwPointersCall() {
        LoaderSummwPointers obj = new LoaderSummwPointers();
        int a= 5;
        int b= 8;
        assertEquals(obj.SummwPointersCall(getPointer(a), getPointer(b)), 13);
        assertNotEquals(obj.SummwPointersCall(getPointer(a), getPointer(b)),  17);
    }

    Pointer getPointer(int input){
        Pointer pointer = new Memory(4);
        pointer.setInt(0,input);
        return  pointer;

    }
}