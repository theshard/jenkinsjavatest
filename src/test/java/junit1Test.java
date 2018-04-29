import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class junit1Test {
    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("Hello from setup");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("Hello from teardown");
    }

    @Test
    public void junitTest(){
        System.out.println("Hello from junit Test");
    }

    @BeforeClass
    public static void junitBeforeClass(){
        System.out.println("Hello from Before Class");
    }
}