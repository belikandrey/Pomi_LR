package by.bsuir.task1_6;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = Util.getCars(scanner);
        System.out.println("Enter Brand for search : ");
        String brand = scanner.nextLine();
        System.out.println("With brand : " + brand + " : ");
        Arrays.stream(Util.filterByBrand(cars, brand)).forEach(System.out::println);

        System.out.println("Enter Model for search : ");
        String model = scanner.nextLine();
        System.out.println("Enter n : ");
        int n = scanner.nextInt();
        System.out.println("With model " + model + " and year > " + n);
        Arrays.stream(Util.filterByModelLifetime(cars, model, n)).forEach(System.out::println);

        System.out.println("Enter year : ");
        int year = scanner.nextInt();
        System.out.println("Enter price : ");
        BigDecimal price = scanner.nextBigDecimal();
        System.out.println("With year " + year + " and price more than : " + price + " : ");
        Arrays.stream(Util.filterByYearPrice(cars, year, price)).forEach(System.out::println);
        scanner.close();
    }
}
