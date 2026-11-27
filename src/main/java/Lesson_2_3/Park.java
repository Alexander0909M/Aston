package Lesson_2_3;

public class Park {

    private String name;

    public Park(String name) {
        this.name = name;
    }

    public class Attraction {

        private String name;
        private String workingTime;
        private double price;

        public Attraction(String name,
                          String workingTime,
                          double price) {

            this.name = name;
            this.workingTime = workingTime;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Название парка: " + Park.this.name);
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingTime);
            System.out.println("Стоимость: " + price);
            System.out.println("------------------------------");
        }
    }
}