import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberComparatorTest {
    @Test
    public void shouldEqualNumbersIfAMoreB() {
        CalcMethods method = new CalcMethods();
        int a = 10;
        int b = 5;
        String expected = "Число 10 > 5";
        String actual = method.EqualNumbers(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldEqualNumbersIfBMoreA() {
        CalcMethods method = new CalcMethods();
        int a = 5;
        int b = 10;
        String expected = "Число 5 < 10";
        String actual = method.EqualNumbers(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldEqualNumbersIfAEqualsB() {
        CalcMethods method = new CalcMethods();
        int a = 10;
        int b = 10;
        String expected = "Число 10 = 10";
        String actual = method.EqualNumbers(a, b);
        Assertions.assertEquals(expected, actual);
    }
}