import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class HiofTester {
    /* ## Deloppgave 2 ## */
    @ParameterizedTest
    /* Valgte her å bruke @CsvFileSource i stedet for @ValueSource */
    @CsvFileSource(resources = "arguments.csv") //IDE complains this file doesn't exist. Don't trust it :)
    void test(String expected, int value ) {
        assertEquals(expected, HiofFizzBuzz.parse(value));
    }
}
