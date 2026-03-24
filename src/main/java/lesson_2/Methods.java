package lesson2;

public class Methods {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.printThreeWords());
    }

    // Задача 2
    public String checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            return ("Сумма положительная");
        } else {
            return ("Сумма отрицательная");
        }
    }

    // Задача 3

    public String printColor(int value) {
        if (value <= 0) {
            return ("Красный");
        } else if (value > 0 && value <= 100) {
            return ("Желтый");
        } else {
            return ("Зеленый");
        }
    }

    // Задача 4

    public String numberGreat(int a, int b) {
        if (a >= b) {
            return ("a >= b");
        } else {
            return ("a < b");
        }
    }

    // Задача 5

    public boolean isInTheLimit(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // Задача 6

    public String positiveOrNegative(int number) {
        if (number < 0) {
            return ("Отрицательное");
        } else {
            return ("Положительное");
        }
    }

    // Задача 7

    public boolean trueOrFalse(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

    // Задача 8

    public String repeatLine(int value, String str) {
        for (int i = 0; i < value; i++) {
            System.out.println(str);
        }
        return ("");
    }

    // Задача 9

    public boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    // Задача 10

    public int[] editArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            newArr[i] = arr[i];
        }
        return newArr;
    }

    // Задача 14

    public int[] array(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}