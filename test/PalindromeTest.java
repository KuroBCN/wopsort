import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest{

    @Test
    public void testIsPalindromeWhenEvenLength() throws Exception{
        assertEquals(Palindrome.orderInput("car trunk bus"),"bus car trunk");
    }

    @Test
    public void testIsPalindromeWhenOddLength() throws Exception{
        assertEquals(Palindrome.orderInput("8 4 6 1 -2 9 5"),"-2 1 4 5 6 8 9");
    }
    @Test
    public void testIsNotPalindrome() throws Exception{
        assertEquals(Palindrome.orderInput("car truck 8 4 bus 6 1"),"bus car 1 4 truck 6 8");
    }
    @Test
    public void testIsPalindromeEmpty() throws Exception{
        assertEquals(Palindrome.orderInput(""),"");
    }
}