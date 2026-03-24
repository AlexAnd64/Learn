package lesson_7;

public class TriangleArea {
    public static void main(String[] args) {
        System.out.println("Программа расчета площади треугольника.");
        int side_a = 4;
        int side_b = 5;
        int side_c = 3;
        int p = (side_a + side_b + side_c) / 2;
        double area = Math.sqrt(p * (p - side_a) * (p - side_b) * (p - side_c));
        System.out.println("Площадь треугольника: " + area);
    }
}