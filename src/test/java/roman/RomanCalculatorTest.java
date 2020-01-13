package roman;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RomanCalculatorTest {

    private String input1;
    private String input2;
    private String expected;

    @Parameterized.Parameters
    public static Collection prepareData() {
        Object[][] data = {
                {"I", "I", "II"},
                {"I", "X", "XI"},
                {"II", "X", "XII"}
        };
        return Arrays.asList(data);
    }

    public RomanCalculatorTest(String input1, String input2, String expected) {
        this.input1 = input1;
        this.input2 = input2;
        this.expected = expected;
    }

    @Test
    public void testAdd() {
        RomanCalculator romanCalculator = new RomanCalculator();
        String actual = romanCalculator.add(input1, input2);
        assertEquals(expected, actual);
    }
}