package lesson_3;

import java.time.LocalDate;

public class AllProducts {
    public static void main(String[] args) {
        Product product = new Product(
                "Монитор Samsung",
                LocalDate.of(2026, 12, 5),
                "Samsung",
                "Южная Корея",
                55999,
                false
        );

        product.showProduct();

        Product[] productsArray = new Product[5];
        productsArray[0] = new Product(
                "Redmi Note 9 PRO",
                LocalDate.of(2026, 10, 5),
                "Xiaomi",
                "Китай",
                18500,
                true
        );

        productsArray[1] = new Product(
                "Samsung A5",
                LocalDate.of(2025, 12, 3),
                "Samsung",
                "Китай",
                25800,
                true
        );

        productsArray[2] = new Product(
                "Пылесос Тайфун",
                LocalDate.of(2023, 5, 12),
                "Тайфун",
                "Китай",
                5600,
                false
        );

        productsArray[3] = new Product(
                "Соковыжималка juice90 Tefale",
                LocalDate.of(2024, 8, 14),
                "Tefale",
                "Китай",
                3200,
                false
        );

        productsArray[4] = new Product(
                "Стиральная машина Bosh",
                LocalDate.of(2022, 2, 22),
                "Bosh",
                "Китай",
                39700,
                true
        );
    }
}