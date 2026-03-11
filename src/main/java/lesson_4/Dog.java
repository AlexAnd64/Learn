package lesson_4;

public class Dog extends Animals {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака " + name + " пробежала: " + distance + " метров.");
        } else {
            System.out.println("Собака " + name + " пробежала 500 метров и устала! Больше она бежать не может!");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance < 1) {
            System.out.println("Собака не полезла в воду");
        } else if (distance >= 10) {
            System.out.println("Собака " + name + " проплыла 10 метров и вылезла из воды");
        } else {
            System.out.println("Собака" + name + " проплыла " + distance + " метров!");
        }
    }

    static int getDogCount() {
        return dogCount;
    }
}
