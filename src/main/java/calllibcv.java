import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class calllibcv {
    public interface CLibrary extends Library {
        public static class Session extends Structure {
            @Override
            protected List<String> getFieldOrder() {
                return Arrays.asList(new String[] { "a", "b"});

            }
            public static class ByReference extends callCplplStruct.CLibrary.inputStruct implements Structure.ByReference {}
            public int a;
            public int b;

        }


        public static class resultStruct extends Structure {
            @Override
            protected List<String> getFieldOrder() {
                return Arrays.asList(new String[] { "result", "error"});

            }
            public static class ByReference extends callCplplStruct.CLibrary.resultStruct implements Structure.ByReference {}
            public int result;
            public int error;

        }
        callCplplStruct.CLibrary INSTANCE = (callCplplStruct.CLibrary) Native.loadLibrary(("simpleSo"), callCplplStruct.CLibrary.class);
        int summ(int a, int b);
        callCplplStruct.CLibrary.resultStruct letsSumm(callCplplStruct.CLibrary.inputStruct flow);

    }
    int call_cpluplus_summ(int a, int b){
        return callCplplStruct.CLibrary.INSTANCE.summ(a,b);
    }

    callCplplStruct.CLibrary.resultStruct callLetsSumm(callCplplStruct.CLibrary.inputStruct flow){
        return callCplplStruct.CLibrary.INSTANCE.letsSumm(flow);
    }
}
