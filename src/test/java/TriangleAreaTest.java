import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleAreaTest {
    @Test
    public void shouldCalcAreaTriangleWithPositiveValues() {
        CalcMethods method = new CalcMethods();
        Assert.assertEquals(method.CalcAreaTriangle(2, 4, 5), 3.8);
    }

    @Test
    public void shouldCalcAreaTriangleWithNegativeValues() {
        CalcMethods method = new CalcMethods();
        Assert.assertEquals(method.CalcAreaTriangle(-2, -4, -5), 3.8);
    }

    @Test
    public void shouldCalcAreaTriangleIfOneSideEqualZero() {
        CalcMethods method = new CalcMethods();
        Assert.assertEquals(method.CalcAreaTriangle(0, -4, -5), 0);
    }
}