import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekExpressionTest {

    @Test
    public void interpret() {
        DayOfTheWeekExpression expr = new DayOfTheWeekExpression("1-5");
        String expected = "1 2 3 4 5";
        String actual = expr.interpret("1-5");
        assertEquals(expected,actual);
    }

    @Test
    public void interpretUnsupported(){
        DayOfTheWeekExpression expr = new DayOfTheWeekExpression("-5");
        String expected = "Unsupported data at: DayOfTheWeekExpression";
        String actual = expr.interpret("-5");
        assertEquals(expected,actual);
    }
}