package lesson_7;

public class ArithmeticOperations {
    public static void main(String[] args) {
        System.out.println("Программа калькулятор.");
        double a = 5;
        double b = 3;
        System.out.println("Сумма чисел: " + (a + b));
        System.out.println("Разность чисел: " + (a - b));
        System.out.println("Произведение чисел: " + (a * b));
        System.out.println("Деление чисел: " + (Math.round((a / b) * 10) / 10.0));
    }
}