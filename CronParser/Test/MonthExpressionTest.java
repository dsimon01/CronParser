import org.junit.Test;

import static org.junit.Assert.*;

public class MonthExpressionTest {

    @Test
    public void interpret(){

        MonthExpression expr = new MonthExpression("*");
        String expected = "1 2 3 4 5 6 7 8 9 10 11 12";
        String actual = expr.interpret("*");
        assertEquals(expected,actual);
    }

    @Test
    public void interpretDefaultTest(){
        MonthExpression expr = new MonthExpression("*01");
        String expected = "Unsupported data at: MonthExpression";
        String actual =  expr.interpret("*01");
        assertEquals(expected,actual);
    }
}