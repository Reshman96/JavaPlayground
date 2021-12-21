package week2.mockito;

import week2.test.Spartan;
import week2.test.SpartanRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

public class SpartanRepositoryTests {

    private Spartan mockSpartan;

    @BeforeEach
    void setup() {
        mockSpartan = Mockito.mock(Spartan.class);
    }

    @Test
    @DisplayName("Mocking a Spartan")
    void mockingASpartan() {
        SpartanRepository.addSpartan(mockSpartan);
        Mockito.when(mockSpartan.toString()).thenReturn("Found Mock Spartan");
        System.out.println(mockSpartan.toString());
        Assertions.assertEquals("Found Mock Spartan" + "\n", SpartanRepository.getAllSpartans());
        // As a user, I want to take money from account because I am broke
        // Acceptance Criteria
        // given, when, then
        // given I have a card and correct pin, when I enter the card and my pin, then I will
    }

    @Test
    @DisplayName("Chain Method calls with a Mock")
    void chainMethodCallsWithAMock() {
        Mockito.when(mockSpartan.getStartDate())
                .thenReturn(LocalDate.now())
                .thenReturn(LocalDate.MAX);

        System.out.println(mockSpartan.getStartDate());
        System.out.println(mockSpartan.getStartDate());
    }
}
