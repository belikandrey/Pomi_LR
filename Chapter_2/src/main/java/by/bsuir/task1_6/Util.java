package by.bsuir.task1_6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Util {

    private static BigInteger Id = BigInteger.ZERO;

    public static Car[] getCars(Scanner scanner) {
        int num;
        System.out.print("Enter n : ");
        num = scanner.nextInt();
        scanner.nextLine();
        Car houses[] = new Car[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter Brand : ");
            String brand = scanner.nextLine();
            System.out.print("Enter Model : ");
            String model = scanner.nextLine();
            System.out.print("Enter Color : ");
            String color = scanner.nextLine();
            System.out.print("Enter Number : ");
            String number = scanner.nextLine();
            System.out.print("Enter year : ");
            int year = scanner.nextInt();
            System.out.print("Enter price : ");
            BigDecimal price = scanner.nextBigDecimal();
            scanner.nextLine();
            houses[i] = new Car(getNextId(), brand, model, year, color, price, number);
        }
        return houses;
    }

    public static Car[] filterByBrand(Car[] cars, String brand) {
        return Arrays.stream(cars).filter((p) -> p.getBrand().equalsIgnoreCase(brand)).toArray(Car[]::new);
    }

    public static Car[] filterByModelLifetime(Car[] cars, String model, int years) {
        int now = LocalDateTime.now().getYear();
        return Arrays.stream(cars).filter((p) -> p.getModel().equalsIgnoreCase(model) && (now - p.getYearIssue()) > years).toArray(Car[]::new);
    }

    public static Car[] filterByYearPrice(Car[] cars, int year, BigDecimal price) {
        return Arrays.stream(cars).filter((p) -> p.getYearIssue() == year && p.getPrice().compareTo(price) > 0).toArray(Car[]::new);
    }

    public static BigInteger getNextId() {
        Id = Id.add(BigInteger.ONE);
        return Id;
    }

}
