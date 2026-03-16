import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberComparatorTest {
    @Test
    public void shouldEqualsTwoNumbersIfAMoreB() {
        CalcMethods method = new CalcMethods();
        Assert.assertEquals(method.EqualNumbers(10, 5), "Число 10 > 5");
    }

    @Test
    public void shouldEqualsTwoNumbersIfBMoreA() {
        CalcMethods method = new CalcMethods();
        Assert.assertEquals(method.EqualNumbers(6, 9), "Число 6 < 9");
    }

    @Test
    public void shouldEqualsTwoNumbersIfAEqualB() {
        CalcMethods method = new CalcMethods();
        Assert.assertEquals(method.EqualNumbers(9, 9), "Число 9 = 9");
    }
}