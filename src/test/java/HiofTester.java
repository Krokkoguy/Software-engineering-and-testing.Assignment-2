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
            "Hi, 6",
            "7, 7",
            "8, 8",
            "Hi, 9",
            "Of, 5",
            "11, 11",
            "Hi, 12",
            "13, 13",
            "14, 14",
            "HiOf, 15"
    })
    void test(String expected, int value ) {
        assertEquals(expected, HiofFizzBuzz.parse(value));
    }
}
