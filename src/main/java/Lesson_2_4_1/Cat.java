package Lesson_2_4_1;

public class Cat extends Animal {

    private static int catCount = 0;
    private boolean satiety = false;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int food) {
        if (bowl.decreaseFood(food)) {
            satiety = true;
            System.out.println(name + " покушал и теперь сыт.");
        } else {
            System.out.println(name + " не хватило еды, он остался голодным.");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public static int getCatCount() {
        return catCount;
    }
}

