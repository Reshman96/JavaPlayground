package week2.arrayMerge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week2.arrayMerge.MergeArrays;

public class MergeArraysTest {

    @Test
    public void MergeTest() {

        Assertions.assertArrayEquals(new int[]{1, 3, 3, 7}, MergeArrays.merge(new int[][]{{1, 3}, {3, 7}}));
    }

    @Test
    public void AscendingTest() {

        Assertions.assertArrayEquals(new int[]{3, 5, 6, 8}, MergeArrays.ascend(new int[]{8, 5, 6, 3}));
        Assertions.assertArrayEquals(new int[]{2, 4, 6, 8}, MergeArrays.ascend(new int[][]{{6, 4}, {2, 8}}));
    }

    @Test
    public void DescendingTest() {

        Assertions.assertArrayEquals(new int[]{8, 6, 5, 3}, MergeArrays.descend(new int[]{8, 5, 6, 3}));
        Assertions.assertArrayEquals(new int[]{8, 6, 4, 2}, MergeArrays.descend(new int[][]{{6, 4}, {2, 8}}));
    }

    @Test
    public void removeDuplicatesTest() {

        Assertions.assertArrayEquals(new int[]{0, 1, 3, 4, 5, 7, 9}, MergeArrays.removeDuplicates(new int[]{5, 3, 9, 0, 5, 3, 9, 4, 1, 4, 7}));
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, MergeArrays.removeDuplicates(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 5}));
        Assertions.assertArrayEquals(new int[]{1, 3, 7}, MergeArrays.removeDuplicates(new int[][]{{1, 3}, {3, 7}}));
    }
}
