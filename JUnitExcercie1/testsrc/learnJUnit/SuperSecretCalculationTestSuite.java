package learnJUnit;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({

        SuperSecretCalculationTest.class,
        SuperSecretCalculationTest2.class
})

public class SuperSecretCalculationTestSuite {



}