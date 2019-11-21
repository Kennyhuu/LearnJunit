package learnJUnit;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuperSecretCalculationTest2 {
    SuperSecretCalculation rocky = new SuperSecretCalculation("Rock");
    @Test
    public void testsuitMessage() {
        System.out.println("Suite");
        assertEquals("Rock", rocky.getName());
    }
}