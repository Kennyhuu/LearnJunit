package learnJUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class SuperSecretCalculationTestRunner {

    public static void main(String[]args){
        Result result = JUnitCore.runClasses(SuperSecretCalculationTestSuite.class);

        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}