package lesson_7;

public class NumberComparator {
    public static void main(String[] args) {
        System.out.println("Программа сравнения двух чисел.");
        int number1 = 10;
        int number2 = 5;
        if (number1 > number2) {
            System.out.println("Число " + number1 + " > " + number2);
        } else if (number1 < number2) {
            System.out.println("Число " + number2 + " > " + number1);
        } else {
            System.out.println("Число " + number2 + " = " + number1);
        }
    }
}