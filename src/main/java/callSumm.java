import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class callSumm {
    public Map<Integer, String> onLoadLibraryErrors;
    public interface CLibrary extends Library {
        CLibrary INSTANCE = (CLibrary) Native.loadLibrary(("summary"), CLibrary.class);
        int summary(int a, int b);

    }
    int call_summ(int a, int b){
        return CLibrary.INSTANCE.summary( a, b);
    }

}
