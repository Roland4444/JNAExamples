import org.junit.Test;

import static org.junit.Assert.*;

public class callEBSTest {

    @Test
    public void call_ebs() throws InterruptedException {
        callEBS cebs = new callEBS();
        callEBS.CLibrary.ResultCheck rc = new callEBS.CLibrary.ResultCheck();
        rc = cebs.call_ebs("./cv_configuration.json", "./5.wav");

        assertEquals(rc.lastErrorInSession, 0);
        System.out.println("./cv_configuration.json"+ "    ./5.wav");
        printEBSCheckResult(cebs.call_ebs("./cv_configuration.json", "./5.wav"), cebs);
        System.out.println("./cv_configuration.json"+ "      ./a2002011001_e02_16kHz.wav.wav");
        printEBSCheckResult(cebs.call_ebs("./cv_configuration.json", "./a2002011001_e02_16kHz.wav.wav"), cebs);
        System.out.println("./cv_configuration.json000"+"    ./5.wav");
        printEBSCheckResult(cebs.call_ebs("./cv_configuration.json000", "./5.wav"), cebs);
    }

    void printEBSCheckResult(callEBS.CLibrary.ResultCheck rc, callEBS ebs){
        System.out.println("Resulting check==>"+ebs.onLoadLibraryErrors.get(rc.ResultLoadingSoSymbols));
        System.out.println("\n\nlastErrorInSession   ="+rc.lastErrorInSession);
        System.out.println("checkResult  = "+rc.checkResult);
        System.out.println("ResultLoadingSoSymbols     = "+rc.ResultLoadingSoSymbols +"\n\n");
    }
}