import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class LetsPrintChar {
    public interface CLibrary extends Library {

        CLibrary INSTANCE = (CLibrary) Native.loadLibrary(("letsprintCharPtr"), CLibrary.class);
        String letsprintCharPtr(String constChar);

    }
    String call_letsprintCharPtr(String flow){
       return  CLibrary.INSTANCE.letsprintCharPtr(flow);
    }

}
