package challenges.week1.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzGeneratorTest {

    FizzBuzzGenerator generator = new FizzBuzzGenerator();

    @Test
    public void thirdItemIsBuzzTest() {

        Assertions.assertEquals("Fizz", generator.FizzBuzz(20).get(2));
    }

    @Test
    public void fifthItemIsBuzzTest() {

        Assertions.assertEquals("Buzz", generator.FizzBuzz(20).get(4));
    }

    @Test
    public void fifteenthItemIsBuzzTest() {

        Assertions.assertEquals("FizzBuzz", generator.FizzBuzz(20).get(14));
    }

    @Test
    public void nIs100Test() {

        Assertions.assertEquals("Buzz", generator.FizzBuzz(100).get(99));
    }

    @Test
    public void twentySecondItemIsNotReplacedTest() {

        Assertions.assertEquals("22", generator.FizzBuzz(40).get(21));
    }
}
