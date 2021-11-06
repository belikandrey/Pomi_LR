package by.bsuir.task1_4;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        House[] houses = Util.getHouses(scanner);
        System.out.println("Enter num rooms for search : ");
        int numRooms = scanner.nextInt();
        System.out.println("With "+numRooms+" rooms : ");
        Arrays.stream(Util.filterByNumRooms(houses, numRooms)).forEach(System.out::println);

        System.out.println("Enter num rooms for search : ");
        int numRoomsSecond = scanner.nextInt();
        System.out.println("Enter floor from : ");
        int floorFrom = scanner.nextInt();
        System.out.println("Entre floor to : ");
        int floorTo = scanner.nextInt();
        System.out.println("With "+numRooms+" rooms, from "+floorFrom+", to "+floorTo);
        Arrays.stream(Util.filterByNumRoomsAndFloorRange(houses, numRoomsSecond, floorFrom, floorTo)).forEach(System.out::println);

        System.out.println("Enter square : ");
        double square = scanner.nextDouble();
        System.out.println("With square more than "+square+" : ");
        Arrays.stream(Util.filterBySquareMore(houses, square)).forEach(System.out::println);
        scanner.close();
    }
}
