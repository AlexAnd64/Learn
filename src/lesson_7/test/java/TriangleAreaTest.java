import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleAreaTest {
    @Test
    public void shouldCalculateAreaTriangleWithPositive() {
        CalcMethods method = new CalcMethods();
        int side_a = 4;
        int side_b = 5;
        int side_c = 3;
        double expected = 6.0;
        double actual = method.CalcAreaTriangle(side_a, side_b, side_c);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAreaTriangleWithOneSideValueZero() {
        CalcMethods method = new CalcMethods();
        int side_a = 4;
        int side_b = 5;
        int side_c = 0;
        double expected = 0;
        double actual = method.CalcAreaTriangle(side_a, side_b, side_c);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAreaTriangleWithOneSideValueNegative() {
        CalcMethods method = new CalcMethods();
        double side_a = 2;
        double side_b = 4;
        double side_c = -5;
        double expected = 3.8;
        double actual = method.CalcAreaTriangle(side_a, side_b, side_c);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAreaTriangleWithFractionalNumbers() {
        CalcMethods method = new CalcMethods();
        double side_a = 2.4;
        double side_b = 4.8;
        double side_c = -5.1;
        double expected = 5.7;
        double actual = method.CalcAreaTriangle(side_a, side_b, side_c);
        Assertions.assertEquals(expected, actual);
    }
}