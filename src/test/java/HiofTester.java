import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
public class HiofTester {
    @Test
    void test(){
        assertEquals("1",HiofFizzBuzz.parse(1));
        assertEquals("2",HiofFizzBuzz.parse(2));
    }
}
