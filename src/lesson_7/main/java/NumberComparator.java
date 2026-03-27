public class NumberComparator {
    public static void main(String[] args) {
        System.out.println("Программа сравнения двух чисел.");
        int a = 10;
        int b = 10;
        CalcMethods method = new CalcMethods();
        String result = method.EqualNumbers(a, b);
        System.out.println(result);
    }
}