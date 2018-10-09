import com.sun.jna.*;

import java.util.Arrays;
import java.util.List;

public class SummStructPointer {
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

        CLibrary INSTANCE = (CLibrary) Native.loadLibrary(("summPointerStruct"), CLibrary.class);
        int structSummPointer(input a);




    }
}
