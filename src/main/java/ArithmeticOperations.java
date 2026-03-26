public class ArithmeticOperations {
    public static void main(String[] args) {
        System.out.println("Программа калькулятор.");
        CalcMethods method = new CalcMethods();
        double a = 5;
        double b = 3;
        double sum = method.CalcSum(a, b);
        System.out.println("Сумма: " + sum);
        double difference = method.CalcDifference(a, b);
        System.out.println("Разность: " + difference);
        double multiplying = method.CalcMultiplying(a, b);
        System.out.println("Умножение: " + multiplying);
        double dividing = method.CalcDividing(a, b);
        System.out.println("Деление: " + dividing);
    }
}