import com.sun.jna.*;

import java.util.Arrays;
import java.util.List;

public class SendSimpleStruct {
    public interface CLibrary extends Library {

        public static class input extends Structure {
            @Override
            protected List<String> getFieldOrder() {
                return Arrays.asList(new String[] { "a", "b"});

            }
            public static class ByReference extends input implements Structure.ByReference {}
            public int a;
            public int b;

        }

        CLibrary INSTANCE = (CLibrary) Native.loadLibrary(("summStruct"), CLibrary.class);
        int structSumm(input a);




    }




}