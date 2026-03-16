
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Программа расчета факториала числа.");
        int number = -5;
        number = Math.abs(number);
        CalcMethods method = new CalcMethods();
        int factorial = method.CalcFactorial(number);
        System.out.println("Факториал числа " + number + ": " + factorial);
        System.out.println(" ");
    }
}