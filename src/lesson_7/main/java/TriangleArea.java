public class TriangleArea {
    public static void main(String[] args) {
        System.out.println("Программа расчета площади треугольника.");
        double side_a = 2.4;
        double side_b = 4.8;
        double side_c = 5.1;
        CalcMethods method = new CalcMethods();
        double result = method.CalcAreaTriangle(side_a, side_b, side_c);
        System.out.println("Площадь треугольника: " + result);
    }
}