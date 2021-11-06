package by.bsuir.task1_4;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Util {

    private static BigInteger Id = BigInteger.ZERO;

    public static House[] getHouses(Scanner scanner) {
        int num;
        System.out.print("Enter n : ");
        num = scanner.nextInt();
        scanner.nextLine();
        House houses[] = new House[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter Flat Num : ");
            String flatNum = scanner.nextLine();
            System.out.print("Enter Square : ");
            Double square = scanner.nextDouble();
            System.out.print("Enter floor : ");
            int floor = scanner.nextInt();
            System.out.print("Enter num rooms : ");
            int numRooms = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter street : ");
            String street = scanner.nextLine();
            System.out.print("Enter Building type : ");
            String buildingType = scanner.nextLine();
            System.out.println("Enter lifetime : ");
            long lifetyme = scanner.nextLong();
            scanner.nextLine();
            houses[i] = new House(getNextId(), flatNum, square, floor, numRooms, street, buildingType, lifetyme);
        }
        return houses;
    }

    public static House[] filterByNumRooms(House[] houses, int numRooms) {
        return Arrays.stream(houses).filter((p) -> p.getNumRooms() == numRooms).toArray(House[]::new);
    }

    public static House[] filterByNumRoomsAndFloorRange(House[] houses, int numRooms, int floorFrom, int floorTo) {
        return Arrays.stream(filterByNumRooms(houses, numRooms)).filter((p) -> p.getFloor() >= floorFrom && p.getFloor() <= floorTo).toArray(House[]::new);
    }

    public static House[] filterBySquareMore(House[] houses, double square){
        return Arrays.stream(houses).filter((p)->p.getSquare()>square).toArray(House[]::new);
    }

    public static BigInteger getNextId() {
        Id = Id.add(BigInteger.ONE);
        return Id;
    }

}
