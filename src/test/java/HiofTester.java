import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class HiofTester {
    @ParameterizedTest
    @CsvFileSource(resources = "arguments.csv")
    void test(String expected, int value ) {
        assertEquals(expected, HiofFizzBuzz.parse(value));
    }
}
