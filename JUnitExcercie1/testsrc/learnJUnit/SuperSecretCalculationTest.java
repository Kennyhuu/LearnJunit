package learnJUnit;

import learnJUnit.SuperSecretCalculation;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class SuperSecretCalculationTest {

    private SuperSecretCalculation rocky = new SuperSecretCalculation("Rocky");

    @Before
    public void myTestSetUp() throws Exception {
        rocky = new SuperSecretCalculation("Rocky");
    }

    @Test
    public void getName() throws Exception {

        assertEquals("Rocky",rocky.getName());

    }

    @Test
    public void testUnHappyToStart() {
        assertFalse(rocky.isHappy());

    }

    @Test
    public void testHappyAfterPlay() {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }

    @Ignore("Exception throwing not yet defined")
    @Test(expected = IllegalStateException.class)// Erwartet Fehlermeldung / wenn ja PASS
    public void nameFail() {
        rocky.getHappyMessage();
    }

    @Test
    public void name() {
        rocky.playWithRock();
        String msg = rocky.getHappyMessage();
        assertEquals("Im Happy",msg);
    }

    @Test
    public void testFavNumb() {
        assertEquals(42, rocky.getFavNumber());
    }

    @Test(expected =  IllegalArgumentException.class)
    public void emptyNameFail() {
        new SuperSecretCalculation("");
    }
/*
    @Test(timeout = 100)// in ms // if takes to long
    public void waitForHappyTimeout() {
        rocky.waitTillHappy();
    }*/
}
