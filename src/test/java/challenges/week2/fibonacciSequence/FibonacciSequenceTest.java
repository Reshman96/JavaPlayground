package challenges.week2.fibonacciSequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciSequenceTest {

    @Test
    public void FirstTenNumbersInTheSequence() {

        Assertions.assertArrayEquals(new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34}, FibonacciSequence.make(0, 1, 10));
    }
}
