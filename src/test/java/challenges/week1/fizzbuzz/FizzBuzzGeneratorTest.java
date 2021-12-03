package challenges.week1.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzGeneratorTest {

    @Test
    public void thirdItemIsBuzzTest() {
        FizzBuzzGenerator generator = new FizzBuzzGenerator();

        Assertions.assertEquals("Fizz", generator.FizzBuzz(20).get(2));
    }

    @Test
    public void fifthItemIsBuzzTest() {
        FizzBuzzGenerator generator = new FizzBuzzGenerator();

        Assertions.assertEquals("Buzz", generator.FizzBuzz(20).get(4));
    }

    @Test
    public void fifteenthItemIsBuzzTest() {
        FizzBuzzGenerator generator = new FizzBuzzGenerator();

        Assertions.assertEquals("FizzBuzz", generator.FizzBuzz(20).get(14));
    }

    @Test
    public void nIs100Test() {
        FizzBuzzGenerator generator = new FizzBuzzGenerator();

        Assertions.assertEquals("Buzz", generator.FizzBuzz(100).get(99));
    }

    @Test
    public void twentySecondItemIsNotReplacedTest() {
        FizzBuzzGenerator generator = new FizzBuzzGenerator();

        Assertions.assertEquals("22", generator.FizzBuzz(40).get(21));
    }
}
