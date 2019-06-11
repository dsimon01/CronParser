import org.junit.Test;

import static org.junit.Assert.*;

public class MinuteExpressionTest {

    @Test
    public void interpret() {
        MinuteExpression expr = new MinuteExpression("*");
        String expected = "1 2 3 4 5 6 7 8 9 10...";
        String actual = expr.interpret("*");
        assertEquals(expected,actual);
    }

    @Test
    public void interpretUnsupported() {
        MinuteExpression expr = new MinuteExpression("***");
        String expected = "Unsupported data at: MinuteExpression";
        String actual = expr.interpret("***");
        assertEquals(expected,actual);
    }
}