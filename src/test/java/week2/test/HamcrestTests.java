package week2.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import week2.test.Spartan;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestTests {
    private Spartan spartan;

    @BeforeEach
    void setup() {
        spartan = new Spartan(1, "Reshman", "Java", LocalDate.now());
    }

    @Nested
    @DisplayName("Hamcrest Spartan Tests")
    class HamcrestSpartanTests {
        @Test
        @DisplayName("Hamcrest: Spartan is called Reshman")
        void checkThatSpartanIsCalledReshman() {
            assertThat(spartan.getName(), equalTo("Reshman"));
        }

        @Test
        @DisplayName("Hamcrest: Spartan has a field called 'name'")
        void hamcrestSpartanHasAFieldCalledName() {
            assertThat(spartan, hasProperty("name"));
        }

        @Test
        @DisplayName("Hamcrest: Spartan has a field called course and it is set to 'Java'")
        void hamcrestSpartanHasAFieldCalledCourseAndItIsSetToJava() {
            assertThat(spartan, hasProperty("course", equalTo("Java")));
        }
    }

    @Nested
    @DisplayName("Hamcrest String Methods")
    class HamstringStringMethods {
        @Test
        @DisplayName("Hamcrest: check a string is null or empty")
        void hamcrestCheckAStringIsNullOrEmpty() {
            assertThat(spartan.getName(), isEmptyOrNullString());
        }

        @Test
        @DisplayName("Hamcrest: checkthat'Reshman' ends with 'man'")
        void hamcrestCheckThatReshmanEndsWithMan() {
            assertThat(spartan.getName(), endsWith("man"));
        }
    }
}
