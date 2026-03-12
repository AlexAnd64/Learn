package lesson_2;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {

        int length = 100;
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));
    }
}
