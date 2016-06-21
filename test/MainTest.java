import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

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
    @Test
    public void testMainIsPalindrome() throws Exception{
        String[] args = {"1"};
        Main.main(args);
        assertEquals("Is Palindrome\n", outContent.toString());
    }

    @Test
    public void testMainIsNotPalindrome() throws Exception{
        String[] args = {"12"};
        Main.main(args);
        assertEquals("Is not palindrome\n", outContent.toString());
    }
    @Test
    public void testMainIsNotPalindromeNull() throws Exception{
        String[] args = {null};
        Main.main(args);
        assertEquals("Is not palindrome\n", outContent.toString());
    }
}