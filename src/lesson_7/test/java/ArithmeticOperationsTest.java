import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Float.NaN;

public class ArithmeticOperationsTest {
    @Test
    public void shouldCalculateSum() {
        CalcMethods method = new CalcMethods();
        double a = 5;
        double b = 3;
        double expected = 8;
        double actual = method.CalcSum(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateDifference() {
        CalcMethods method = new CalcMethods();
        double a = 5;
        double b = 1;
        double expected = 4;
        double actual = method.CalcDifference(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMultiplying() {
        CalcMethods method = new CalcMethods();
        double a = 5;
        double b = 5;
        double expected = 25;
        double actual = method.CalcMultiplying(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateDividingPositive() {
        CalcMethods method = new CalcMethods();
        double a = 5;
        double b = 3;
        double expected = 1.7;
        double actual = method.CalcDividing(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateDividingOnZero() {
        CalcMethods method = new CalcMethods();
        double a = 5;
        double b = 0;
        double expected = NaN;
        double actual = method.CalcDividing(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateDividingZeroOnZero() {
        CalcMethods method = new CalcMethods();
        double a = 0;
        double b = 0;
        double expected = NaN;
        double actual = method.CalcDividing(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateDividingZeroOnNumber() {
        CalcMethods method = new CalcMethods();
        double a = 0;
        double b = 5;
        double expected = 0;
        double actual = method.CalcDividing(a, b);
        Assertions.assertEquals(expected, actual);
    }
}