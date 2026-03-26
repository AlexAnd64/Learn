package lesson_4;

public class Bowl {
    private int foodAmount;

    Bowl(int initialFood) {
        this.foodAmount = initialFood;
    }

    public boolean takeFood(int amount) {
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
