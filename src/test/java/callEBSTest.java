import org.junit.Test;

import static org.junit.Assert.*;

public class callEBSTest {

    @Test
    public void call_ebs() throws InterruptedException {
        callEBS cebs = new callEBS();
        callEBS.CLibrary.ResultCheck rc = new callEBS.CLibrary.ResultCheck();
        rc = cebs.call_ebs("./cv_configuration.json", "./5.wav");

        assertEquals(rc.proc_return, 0);
        printEBS(cebs.call_ebs("./cv_configuration.json", "./5.wav"));
        printEBS(cebs.call_ebs("./cv_configuration.json", "./a2002011001_e02_16kHz.wav.wav"));
        printEBS(cebs.call_ebs("./cv_configuration.json000", "./5.wav"));
    }

    void printEBS(callEBS.CLibrary.ResultCheck rc){
        System.out.println("\n\nPROC RET    "+rc.proc_return);
        System.out.println("CHECK  =    "+rc.check);
        System.out.println("INCALL      "+rc.incallreturn+"\n\n");

    }
}