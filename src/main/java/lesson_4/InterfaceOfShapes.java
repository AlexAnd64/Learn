package lesson_4;

interface InterfaceOfShapes {
    default double perimeter() {
        return 0;
    }

    double area();

    String colorFill();

    String colorBorder();
}

class Circle implements InterfaceOfShapes {
    private double radius;
    private String colorFill;
    private String colorBorder;

    public Circle(double radius, String colorFill, String colorBorder) {
        this.radius = radius;
        this.colorFill = colorFill;
        this.colorBorder = colorBorder;
    }

    @Override
    public double perimeter() {
        return Math.round((2 * 3.14 * radius) * 10) / 10.0;

    }

    @Override
    public double area() {
        return Math.round((2 * 3.14 * radius * radius) * 10) / 10.0;
    }

    @Override
    public String colorFill() {
        return colorFill;
    }

    @Override
    public String colorBorder() {
        return colorBorder;
    }
}

class Rectangle implements InterfaceOfShapes {
    private double width;
    private double height;
    private String colorFill;
    private String colorBorder;

    Rectangle(double width, double height, String colorFill, String colorBorder) {
        this.width = width;
        this.height = height;
        this.colorFill = colorFill;
        this.colorBorder = colorBorder;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String colorFill() {
        return colorFill;
    }

    @Override
    public String colorBorder() {
        return colorBorder;
    }
}

class Triangle implements InterfaceOfShapes {
    private double side_a;
    private double side_b;
    private double side_c;
    private String colorFill;
    private String colorBorder;

    public Triangle(double side_a, double side_b, double side_c, String colorFill, String colorBorder) {
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
        this.colorFill = colorFill;
        this.colorBorder = colorBorder;
    }

    @Override
    public double perimeter() {
        return (side_a + side_b + side_c);
    }

    @Override
    public double area() {
        double p = (side_a + side_b + side_c) / 2;
        return Math.round((Math.sqrt(p * (p - side_a) * (p - side_b) * (p - side_c))) * 10) / 10.0;

    }

    @Override
    public String colorFill() {
        return colorFill;
    }

    @Override
    public String colorBorder() {
        return colorBorder;
    }
}
