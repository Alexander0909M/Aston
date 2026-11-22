package Lesson_2_4_2;

public class Rectangle implements Shape {

    private final double width;
    private final double height;
    private final String fillColor;
    private final String borderColor;

    public Rectangle(double width, double height,
                     String fillColor, String borderColor) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException(
                    "Стороны прямоугольника должны быть больше нуля"
            );
        }
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getName() {
        return "Прямоугольник";
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

