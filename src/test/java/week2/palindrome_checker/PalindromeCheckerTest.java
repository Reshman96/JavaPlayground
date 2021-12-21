package week2.palindrome_checker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week2.palindrome_checker.PalindromeChecker;

public class PalindromeCheckerTest {

    @Test
    public void SinglePalindromeCheckerTest() {
        PalindromeChecker word = new PalindromeChecker("Race car");

        Assertions.assertEquals(true, word.isAPalindrome());

        word = new PalindromeChecker("Computer");

        Assertions.assertEquals(false, word.isAPalindrome());
    }

    @Test
    public void NumberOfTimesPalindromeAppearTest() {
        PalindromeChecker sentence = new PalindromeChecker("This sentence mentions kayak, level and radar.");

        Assertions.assertEquals(3, sentence.count());

        Assertions.assertNotEquals(4, sentence.count());
    }
}