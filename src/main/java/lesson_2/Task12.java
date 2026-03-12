package lesson_2;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            newArr[i] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
