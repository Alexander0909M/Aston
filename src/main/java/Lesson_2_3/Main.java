package Lesson_2_3;

public class Main {

    public static void main(String[] args) {

        Product[] productsArray = new Product[5];

        productsArray[0] = new Product(
                "Samsung S25 Ultra",
                "01.02.2025",
                "Samsung Corp.",
                "Korea",
                5599,
                true
        );

        productsArray[1] = new Product(
                "iPhone 16 Pro",
                "15.01.2025",
                "Apple Inc.",
                "China",
                6499,
                false
        );

        productsArray[2] = new Product(
                "Sony PlayStation 5",
                "10.03.2025",
                "Sony",
                "Japan",
                2999,
                true
        );

        productsArray[3] = new Product(
                "Lenovo Legion 5",
                "20.02.2025",
                "Lenovo",
                "China",
                4599,
                false
        );

        productsArray[4] = new Product(
                "LG OLED TV",
                "05.04.2025",
                "LG Electronics",
                "Korea",
                3999,
                false
        );

        System.out.println("===== СПИСОК ТОВАРОВ =====");

        for (Product product : productsArray) {
            product.printInfo();
        }

        System.out.println("===== ПАРК АТТРАКЦИОНОВ =====");

        Park park = new Park("Парк развлечений");

        Park.Attraction attraction1 = park.new Attraction(
                "Колесо обозрения",
                "10:00 - 22:00",
                500
        );

        Park.Attraction attraction2 = park.new Attraction(
                "Американские горки",
                "11:00 - 21:00",
                800
        );

        Park.Attraction attraction3 = park.new Attraction(
                "Карусель",
                "09:00 - 20:00",
                300
        );

        attraction1.printInfo();
        attraction2.printInfo();
        attraction3.printInfo();
    }
}