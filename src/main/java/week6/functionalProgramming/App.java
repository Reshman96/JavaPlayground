package week6.functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // object
        // convert to stream - block of data
        // manipulate stream - Intermediate methods
        // convert back to object - Terminator method

        ArrayList<String> beatles = new ArrayList<>(Arrays.asList(
                "John",
                "Paul",
                "George",
                "Ringo"
        ));

        beatles.stream()
                .filter(s -> s.contains("o"))
                .map(beatle -> beatle + " is in a band")
                .forEach(System.out::println);
    }
}