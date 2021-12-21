package week2.bubbleSortTest;

import week2.bubbleSort.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    public void BubbleSortOnAnArrayTest() {

        Assertions.assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7), BubbleSort.sort(Arrays.asList(5, 4, 7, 3, 1, 2, 6)));
        BubbleSort.displayCounter();
        BubbleSort.displayTime();
    }
}