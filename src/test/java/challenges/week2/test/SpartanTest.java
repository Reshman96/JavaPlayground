package challenges.week2.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SpartanTest {
    private static Spartan spartan;

    @BeforeAll
    static void setup() {
        spartan = new Spartan(1234, "Resh", "Java Developer", LocalDate.parse("2021-11-29", DateTimeFormatter.ISO_DATE));
    }

    @Test
    void getIdTest() {
        Assertions.assertEquals(1234, spartan.getId());
    }

    @Test
    void getNameTest() {
        Assertions.assertEquals("Resh", spartan.getName());
    }

    @Test
    void getCourseTest() {
        Assertions.assertEquals("Java Developer", spartan.getCourse());
    }

    @Test
    void getStartDateTest() {
        Assertions.assertEquals(LocalDate.parse("2021-11-29", DateTimeFormatter.ISO_DATE), spartan.getStartDate());
    }
}
