package lesson_4;

class Cat extends Animals {
    private boolean isFull;
    private static int catCount = 0;

    Cat(String name) {
        super(name);
        this.isFull = false;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кот " + name + " пробежал: " + distance + " метров.");
        } else {
            System.out.println("Кот " + name + " пробежал 200 метров и устал! Больше он бежать не может!");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот " + name + " не умеет плавать!");
    }

    void eat(Bowl bowl, int foodAmount) {
        if (!isFull && bowl.takeFood(foodAmount)) {
            isFull = true;
            System.out.println(name + " поел и теперь сыт.");
        } else if (isFull) {
            System.out.println(name + " уже сыт и не хочет есть.");
        } else {
            System.out.println(name + " хочет поесть " + foodAmount + " ед., но в миске только " + bowl.getFoodAmount() + " ед. еды.");
        }
    }

    boolean isFull() {
        return isFull;
    }

    static int getCatCount() {
        return catCount;
    }
}
