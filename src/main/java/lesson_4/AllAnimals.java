package lesson_4;

public class AllAnimals {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Dog dogSharik = new Dog("Шарик");
        Cat catMurzik = new Cat("Мурзик");
        Cat catBarsik = new Cat("Барсик");

        dogBobik.run(0);
        dogBobik.swim(0);
        catMurzik.run(100);
        catBarsik.swim(3);

        Bowl bowl = new Bowl(25);

        // Массив котов
        Cat[] cats = {catMurzik, catBarsik};

        // Кормим котов
        for (Cat cat : cats) {
            cat.eat(bowl, 15);
        }

        // Выводим информацию о сытости
        System.out.println("");
        System.out.println("Состояние котов: ");
        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isFull());
        }

        // Добавляем еду в миску
        System.out.println("");
        System.out.println("Добавляем 20 ед. еды в миску");
        bowl.addFood(20);

        // Ещё раз кормим Барсика
        catBarsik.eat(bowl, 15);

        // Статистика
        System.out.println("");
        System.out.println("Статистика:");
        System.out.println("Всего животных: " + Animals.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());
    }
}
