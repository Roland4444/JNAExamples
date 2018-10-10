import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class callEBS {
    public interface CLibrary extends Library {
        public static class ResultCheck extends Structure {
            @Override
            protected List<String> getFieldOrder() {
                return Arrays.asList(new String[] { "check", "proc_return","incallreturn" });

            }
            public static class ByReference extends CLibrary.ResultCheck implements Structure.ByReference {}
            public int check;
            public int proc_return;
            public int incallreturn;

        }


        CLibrary INSTANCE = (CLibrary) Native.loadLibrary(("GBP_EBS"), CLibrary.class);
        ResultCheck lets_check(String config, String filename);

    }
    CLibrary.ResultCheck call_ebs(String config, String filename){
        return CLibrary.INSTANCE.lets_check( config,  filename);
    }


}
