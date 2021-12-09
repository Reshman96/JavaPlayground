package challenges.week2.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class ParameterizedTests {

    @ParameterizedTest()
    @ValueSource(ints = {2, 0, 10, 15, 13})
    @DisplayName("Using ints for a parameterized test")
    void doTest(int number) {
        Assertions.assertTrue(number < 10);
    }

    @ParameterizedTest
//    @CsvSource({"Reshman", "Siva"})
    @CsvFileSource(resources = "/names.csv")
    @DisplayName("Testing with literal CSV values")
    void testingForCsvValues(String name) {
        Assertions.assertEquals("Reshman", name);
    }

    @ParameterizedTest
    @MethodSource("printArrays")
    void testThatArraysCanBePrinted(Integer number, String name) {
        Assertions.assertEquals(number, name.length());
    }

    public static Stream<Arguments> printArrays() {
        return Stream.of(
                Arguments.arguments(7, "Reshman"),
                Arguments.arguments(4, "Siva")
        );
    }
}
