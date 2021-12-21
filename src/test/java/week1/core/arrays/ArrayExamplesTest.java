package week1.core.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExamplesTest {

    ArrayExamples arr = new ArrayExamples();

    @Test
    public void checkIfNumOneToFive() {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int[] gameMenuItemsTest1 = {5, 4, 3, 2, 1};

        Arrays.sort(gameMenuItemsTest1);

        Assertions.assertEquals(arrayList, Arrays.asList(gameMenuItemsTest1));
    }
}
