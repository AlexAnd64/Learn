package lesson_3;

import java.time.LocalDate;
import java.util.Arrays;

public class Product {
    private String name;
    private LocalDate productionDate;
    private String manufacturer;
    private String country;
    private double price;
    private boolean isReserved;

    public Product(String name, LocalDate productionDate, String manufacturer, String country, double price, boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isReserved = isReserved;
    }

    public void showProduct() {
        System.out.println("Информация о товаре: ");
        System.out.println("Наименование: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Забронировано: " + (isReserved ? "Да" : "Нет"));
    }
}