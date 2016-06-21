import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest{

    @Test
    public void testIsPalindromeWhenEvenLength() throws Exception{
        assertTrue(Palindrome.isPalindrome("car truck bus"));
    }
    @Test
    public void testIsPalindromeWhenOddLength() throws Exception{
        assertTrue(Palindrome.isPalindrome("8 4 6 1 -2 9 5"));
    }
    @Test
    public void testIsNotPalindrome() throws Exception{
        assertFalse(Palindrome.isPalindrome("car truck 8 4 bus 6 1"));
    }
    @Test
    public void testIsPalindromeEmpty() throws Exception{
        assertEquals(true, Palindrome.isPalindrome(""));
    }
    @Test(expected=Exception.class)
    public void testIsPalindromeNull() throws Exception{
        Palindrome.isPalindrome(null);
    }
}