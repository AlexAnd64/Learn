public class Task8 {
    public static void main(String[] args) {
        Methods method = new Methods();
        int value = 5;
        String str = "Привет, я строка!";

        String returnStr = method.repeatLine(value, str);
        System.out.println(returnStr);
    }
}
