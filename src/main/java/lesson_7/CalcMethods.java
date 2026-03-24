package lesson_7;

public class CalcMethods {
    public int CalcFactorial(int number) {
        number = Math.abs(number);
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}

