package lesson_4;

public abstract class Animals {
    String name;
    private static int animalCount = 0;

    public Animals(String name) {
        this.name = name;
        animalCount++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int getAnimalCount() {
        return animalCount;
    }
}

class Bowl {
    private int foodAmount;

    Bowl(int initialFood) {
        this.foodAmount = initialFood;
    }

    boolean takeFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }

    void addFood(int amount) {
        foodAmount += amount;
    }

    int getFoodAmount() {
        return foodAmount;
    }
}