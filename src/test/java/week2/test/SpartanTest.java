package week2.test;

import org.junit.jupiter.api.*;
import week2.test.Spartan;

import java.time.LocalDate;

public class SpartanTest {
    private static Spartan spartan;


    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @BeforeEach
    void setup() {
        spartan = new Spartan(1, "Resh", "Java", LocalDate.of(2021, 1, 1));
    }

    @RepeatedTest(value = 5, name = "displayName} :: repetition {currentRepetition} of {totalRepition}")
    @DisplayName("This is my test")
    void thisIsMyTest() {

    }

    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName() + " has finished testing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " completed");
    }

//    @Test
//    void getIdTest() {
//        Assertions.assertEquals(1, spartan.getId());
//    }
//
//    @Test
//    void getNameTest() {
//        Assertions.assertEquals("Resh", spartan.getName());
//    }
//
//    @Test
//    void getCourseTest() {
//        Assertions.assertEquals("Java", spartan.getCourse());
//    }
//
//    @Test
//    void getStartDateTest() {
//        Assertions.assertEquals(LocalDate.parse("2021-11-29", DateTimeFormatter.ISO_DATE), spartan.getStartDate());
//    }
}
