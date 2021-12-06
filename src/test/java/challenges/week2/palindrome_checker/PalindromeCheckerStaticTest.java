package challenges.week2.palindrome_checker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerStaticTest {

    @Test
    public void SinglePalindromeCheckerTest() {
        Assertions.assertEquals(true, PalindromeCheckerStatic.isAPalindrome("Race car"));

        Assertions.assertEquals(false, PalindromeCheckerStatic.isAPalindrome("Computer"));
    }

    @Test
    public void NumberOfTimesPalindromeAppearTest() {

        Assertions.assertEquals(3, PalindromeCheckerStatic.count("This sentence mentions kayak, level and radar."));

        Assertions.assertNotEquals(4, PalindromeCheckerStatic.count("This sentence mentions kayak, level and radar."));
    }
}