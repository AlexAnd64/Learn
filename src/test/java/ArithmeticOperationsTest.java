import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;

public class ArithmeticOperationsTest {

    @Test(groups = "arithmetic")
    public void shouldCalcSum() {
        CalcMethods method = new CalcMethods();
        Assert.assertEquals(method.CalcSum(4.0, 3.0), 7);
    }

    @Test(groups = "arithmetic")
    public void shouldCalcDifference() {
        CalcMethods method = new CalcMethods();
        Assert.assertEquals(method.CalcDifference(4.0, 3.0), 1);
    }

    @Test(groups = "arithmetic")
    public void shouldCalcMultiplying() {
        CalcMethods method = new CalcMethods();
        Assert.assertEquals(method.CalcMultiplying(4.0, 3.0), 12);
    }

    @Test(groups = "arithmetic")
    public void shouldCalcDividing() {
        CalcMethods method = new CalcMethods();
        Assert.assertEquals(method.CalcDividing(4.0, 3.0), 1.3);
    }

    @Test(groups = "arithmetic")
    public void shouldCalcDividingOnZero() {
        CalcMethods method = new CalcMethods();
        Assert.assertEquals(method.CalcDividing(4.0, 0), NaN);
    }
}