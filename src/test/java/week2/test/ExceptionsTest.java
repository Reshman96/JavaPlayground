package week2.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionsTest {
    private ArrayList<Integer> array;

    @BeforeEach
    void setup() {
        array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 10})
    @DisplayName("Which values throws an out of bounds exception")
    void checkForOutOfBoundsException(int position) {
//        Exception exception = Assertions.assertThrows(IndexOutOfBoundsException.class, () -> array.get(position));
//        Assertions.assertDoesNotThrow(() -> array.get(position));
//        System.out.println(exception.getMessage());
    }
}
