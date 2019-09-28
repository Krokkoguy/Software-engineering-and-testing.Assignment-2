import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class HiofTester {
    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "Hi, 3",
            "4, 4",
            "Of, 5",
            "Hi, 6"
    })
    void test(String expected, int value ) {
        assertEquals(expected, HiofFizzBuzz.parse(value));
    }
}
