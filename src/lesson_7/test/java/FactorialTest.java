import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    public void shouldCalculateFactorialWithPositive() {
        CalcMethods method = new CalcMethods();
        int number = 5;
        int expected = 120;
        int actual = method.CalcFactorial(number);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateFactorialWithZero() {
        CalcMethods method = new CalcMethods();
        int number = 0;
        int expected = 1;
        int actual = method.CalcFactorial(number);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateFactorialWithNegative() {
        CalcMethods method = new CalcMethods();
        int number = -5;
        int expected = 120;
        int actual = method.CalcFactorial(number);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateFactorialWithOne() {
        CalcMethods method = new CalcMethods();
        int number = 1;
        int expected = 1;
        int actual = method.CalcFactorial(number);
        Assertions.assertEquals(expected, actual);
    }
}