package helloworld2014;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Hello World Tests
 *
 * @author Len Payne
 */
public class HelloWorld2014Test {

    public HelloWorld2014Test() {
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    /**
     * Test of main method, of class HelloWorld2014.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        String expected = "Hello World!";
        String unexpected = "Goodnight Moon!";
        HelloWorld2014.main(args);
        assertTrue(outContent.toString().contains(expected));
        assertFalse(outContent.toString().contains(unexpected));
    }

}
