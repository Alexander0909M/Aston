package Lesson_2_4_2;

public interface Shape {

    double calculateArea();

    String getName();

    String getFillColor();

    String getBorderColor();

    default double calculatePerimeter() {
        return 0;
    }

    default void printInfo() {
        System.out.println("Фигура: " + getName());
        System.out.printf("Периметр: %.2f%n", calculatePerimeter());
        System.out.printf("Площадь: %.2f%n", calculateArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println("----------------------------");
    }
}

