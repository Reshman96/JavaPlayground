package challenges.week2.arrayMerge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeArraysTest {

    @Test
    public void MergeTest() {

        Assertions.assertArrayEquals(new int[]{1, 3, 3, 7}, MergeArrays.merge(new int[][] {{1, 3}, {3, 7}}));
    }

    @Test
    public void AscendingTest() {

        Assertions.assertArrayEquals(new int[]{3, 5, 6, 8}, MergeArrays.ascend(new int[] {8, 5, 6, 3}));
        Assertions.assertArrayEquals(new int[]{2, 4, 6, 8}, MergeArrays.ascend(new int[][] {{6, 4}, {2, 8}}));
    }
}
