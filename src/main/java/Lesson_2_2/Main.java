package Lesson_2_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== Задание 1 =====");
        printThreeWords();

        System.out.println("\n===== Задание 2 =====");
        checkSumSign();

        System.out.println("\n===== Задание 3 =====");
        printColor();

        System.out.println("\n===== Задание 4 =====");
        compareNumbers();

        System.out.println("\n===== Задание 5 =====");
        System.out.println(checkSumRange(7, 8));

        System.out.println("\n===== Задание 6 =====");
        printNumberSign(-5);

        System.out.println("\n===== Задание 7 =====");
        System.out.println(isNegative(-10));

        System.out.println("\n===== Задание 8 =====");
        printString("Hello, Java!", 3);

        System.out.println("\n===== Задание 9 =====");
        System.out.println(isLeapYear(2024));

        System.out.println("\n===== Задание 10 =====");
        invertArray();

        System.out.println("\n===== Задание 11 =====");
        fillArray();

        System.out.println("\n===== Задание 12 =====");
        multiplyArray();

        System.out.println("\n===== Задание 13 =====");
        fillDiagonal();

        System.out.println("\n===== Задание 14 =====");
        int[] result = createArray(5, 7);
        System.out.println(Arrays.toString(result));
    }

    // Задание 1. Вывод трех слов в столбец
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Задание 2. Проверка знака суммы
    public static void checkSumSign() {
        int a = 10;
        int b = -5;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Задание 3. Определение цвета
    public static void printColor() {
        int value = 50;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Задание 4. Сравнение двух чисел
    public static void compareNumbers() {
        int a = 15;
        int b = 10;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // Задание 5. Проверка суммы в диапазоне от 10 до 20
    public static boolean checkSumRange(int a, int b) {
        long sum = (long) a + b;
        return sum >= 10 && sum <= 20;
    }

    // Задание 6. Определение знака числа
    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // Задание 7. Проверка отрицательного числа
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // Задание 8. Повторение строки
    public static void printString(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    // Задание 9. Проверка високосного года
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0);
    }

    // Задание 10. Замена 0 на 1 и 1 на 0
    public static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println("До: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        System.out.println("После: " + Arrays.toString(array));
    }

    // Задание 11. Заполнение массива числами от 1 до 100
    public static void fillArray() {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println(Arrays.toString(array));
    }

    // Задание 12. Умножение чисел меньше 6 на 2
    public static void multiplyArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("До: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }

        System.out.println("После: " + Arrays.toString(array));
    }

    // Задание 13. Заполнение двух диагоналей единицами
    public static void fillDiagonal() {
        int size = 5;
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
            array[i][size - 1 - i] = 1;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    // Задание 14. Создание массива с заданными значениями
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }

        return array;
    }
}
