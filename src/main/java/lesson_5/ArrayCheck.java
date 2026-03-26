package lesson_5;

public class ArrayCheck {
    public static void main(String[] args) throws MyArrayDataException, MyArraySizeException {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"4", "5", "6", "8"},
                {"1", "8", "3", "4"},
                {"50", "2", "3", "4"}
        };

        ArrayCheckMethod method = new ArrayCheckMethod();
        int result = method.processArray(arr);
        System.out.println("Сумма чисел массива: " + result);
        System.out.println(" ");

        String[][] arrOtherSize = {
                {"1", "2", "3", "4"},
                {"4", "5", "6", "8"},
                {"1", "8", "3", "4"}
        };

        try {
            int result1 = method.processArray(arrOtherSize);
            System.out.println("Сумма чисел массива: " + result1);
            System.out.println(" ");
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println(" ");
        }

        String[][] charInArray = {
                {"1", "2", "3", "4"},
                {"4", "bbb", "6", "8"},
                {"1", "8", "3", "4"},
                {"4", "5", "vvv", "8"}
        };

        try {
            int result2 = method.processArray(charInArray);
            System.out.println("Сумма чисел массива: " + result2);
            System.out.println(" ");
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println(" ");
        }

        int[] elements = {1, 2, 3, 4};
        int value = -2;
        try {
            System.out.println("Выведем в консоль " + value + " элемент:");
            System.out.println(elements[value]);
        } catch
        (ArrayIndexOutOfBoundsException e) {
            if (value > elements.length) {
                System.out.println("Ошибка: данный элемент находится за пределами массива!");
            } else if (value < 0) {
                System.out.println("Ошибка: индекс массива не может быть отрицательным!");
            }
        }
    }
}