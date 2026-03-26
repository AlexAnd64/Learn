import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcFactorialTest {
    @Test
    public void shouldCalcFactorialWithPositiveValue() {
        CalcMethods method = new CalcMethods();
        int number = 5;
        int expected = 120;
        int actual = method.CalcFactorial(number);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcFactorialWithValueNegative() {
        CalcMethods method = new CalcMethods();
        int number = -5;
        int expected = 120;
        int actual = method.CalcFactorial(number);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcFactorialWithValueZero() {
        CalcMethods method = new CalcMethods();
        int number = 0;
        int expected = 1;
        int actual = method.CalcFactorial(number);
        Assert.assertEquals(actual, expected);
    }
}