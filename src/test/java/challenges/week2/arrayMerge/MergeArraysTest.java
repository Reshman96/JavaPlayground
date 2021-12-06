package challenges.week2.arrayMerge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeArraysTest {

    @Test
    public void MergeTest() {

        Assertions.assertArrayEquals(new int[]{1, 3, 3, 7}, MergeArrays.merge(new int[][] {{1, 3}, {3, 7}}));
    }
}