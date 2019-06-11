import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfMonthExpressionTest {

    DayOfMonthExpression dayOfMonth = new DayOfMonthExpression("2,6");
    DayOfMonthExpression dayOfMonth_default = new DayOfMonthExpression("*");


    @Test
    public void interpretDefault() {
        String expected = "Unsupported data at: DayOfMonthExpression";
        assertEquals(expected, dayOfMonth_default.interpret("*"));
    }

    @Test
    public void interpretValid() {
        String expected = "2,6";
        assertEquals(expected, dayOfMonth.interpret("2 6"));
    }

}