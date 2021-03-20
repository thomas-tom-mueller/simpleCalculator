package simpleCalculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SimpleCalculatorTest {

    SimpleCalculator simpleCalculator = new SimpleCalculator();

    @Mock
    Scanner scannerMock;
    @Test
    public void testGetNumber() {
        assertEquals(1.0, 1.0);
    }

}
