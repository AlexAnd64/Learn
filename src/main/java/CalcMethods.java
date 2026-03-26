
public class CalcMethods {
    public int CalcFactorial(int number) {
        number = Math.abs(number);
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public double CalcSum(double a, double b) {
        return a + b;
    }

    public double CalcDifference(double a, double b) {
        return a - b;
    }

    public double CalcMultiplying(double a, double b) {
        return a * b;
    }

    public double CalcDividing(double a, double b) {
        if (b == 0) {
            return Double.NaN;
        } else {
            return Math.round((a / b) * 10) / 10.0;
        }
    }

    public String EqualNumbers(int a, int b) {
        if (a > b) {
            return ("Число " + a + " > " + b);
        } else if (b > a) {
            return ("Число " + a + " < " + b);
        } else {
            return (("Число " + a + " = " + b));
        }
    }

    public double CalcAreaTriangle(double side_a, double side_b, double side_c) {
        side_a = Math.abs(side_a);
        side_b = Math.abs(side_b);
        side_c = Math.abs(side_c);
        double result = 0;
        double p = (side_a + side_b + side_c) / 2;
        result = (p * (p - side_a) * (p - side_b) * (p - side_c));
        return Math.round(Math.sqrt(result) * 10) / 10.0;
    }
}