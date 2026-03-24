package lesson2;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        Methods method = new Methods();
        int len = 10;
        int initialValue = 2;

        System.out.println(Arrays.toString(method.array(len, initialValue)));
    }
}
