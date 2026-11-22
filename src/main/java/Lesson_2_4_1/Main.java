package Lesson_2_4_1;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Cat cat3 = new Cat("Клубок");
        dog1.run(150);
        dog1.run(600);
        dog1.swim(10);
        dog1.swim(20);
        cat1.run(150);
        cat1.run(250);
        cat1.swim(10);
        Cat[] cats = {cat1, cat2, cat3};
        Bowl bowl = new Bowl(30);

        for (Cat cat : cats) {
            cat.eat(bowl, 15);
        }

        System.out.println("\nСостояние котов:");

        for (Cat cat : cats) {
            System.out.println(
                    cat.isSatiety() ? "Сыт" : "Голоден"
            );
        }

        bowl.addFood(30);

        for (Cat cat : cats) {
            if (!cat.isSatiety()) {
                cat.eat(bowl, 15);
            }
        }

        System.out.println("\nСтатистика:");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());
        System.out.println("Остаток еды: " + bowl.getFood());
    }
}

