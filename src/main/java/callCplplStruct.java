import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class callCplplStruct {
    public interface CLibrary extends Library {
        public static class inputStruct extends Structure {
            @Override
            protected List<String> getFieldOrder() {
                return Arrays.asList(new String[] { "a", "b"});

            }
            public static class ByReference extends inputStruct implements Structure.ByReference {}
            public int a;
            public int b;

        }


        public static class resultStruct extends Structure {
            @Override
            protected List<String> getFieldOrder() {
                return Arrays.asList(new String[] { "result", "error"});

            }
            public static class ByReference extends resultStruct implements Structure.ByReference {}
            public int result;
            public int error;

        }
        CLibrary INSTANCE = (CLibrary) Native.loadLibrary(("simpleSo"), CLibrary.class);
        int summ(int a, int b);
        resultStruct letsSumm(inputStruct flow);

    }
    int call_cpluplus_summ(int a, int b){
        return CLibrary.INSTANCE.summ(a,b);
    }

    CLibrary.resultStruct callLetsSumm(CLibrary.inputStruct flow){
        return CLibrary.INSTANCE.letsSumm(flow);
    }
}
