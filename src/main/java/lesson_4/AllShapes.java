package lesson_4;

public class AllShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(2, "Зеленый", "Черный");
        System.out.println("Площадь круга: " + circle.area());
        System.out.println("Длина окружности: " + circle.perimeter());
        System.out.println("Цвет заливки: " + circle.colorFill());
        System.out.println("Цвет границ: " + circle.colorBorder());
        System.out.println(" ");

        Rectangle rectangle = new Rectangle(7, 7, "Белый", "Черный");
        System.out.println("Площадь прямоугольника: " + rectangle.area());
        System.out.println("Периметр прямоугольника: " + rectangle.perimeter());
        System.out.println("Цвет заливки: " + rectangle.colorFill());
        System.out.println("Цвет границы: " + rectangle.colorBorder());
        System.out.println(" ");

        Triangle triangle = new Triangle(4,4,6, "Желтый","Красный");
        System.out.println("Площадь треугольника: " + triangle.area());
        System.out.println("Периметр треугольника: " + triangle.perimeter());
        System.out.println("Цвет заливки: " + triangle.colorFill());
        System.out.println("Цвет границ: " + triangle.colorBorder());
    }
}
