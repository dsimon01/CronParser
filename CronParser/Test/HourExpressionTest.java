import org.junit.Test;

import static org.junit.Assert.*;

public class HourExpressionTest {

    @Test
    public void interpretUnsupported(){
        HourExpression expr = new HourExpression("-5");
        String expected = "Unsupported data at: HourExpression";
        String actual = expr.interpret("-5");
        assertEquals(expected,actual);
    }

    @Test
    public void interpret(){
        HourExpression expr = new HourExpression("1");
        String expected = "1";
        String actual = expr.interpret("1");
        assertEquals(expected,actual);
    }
}