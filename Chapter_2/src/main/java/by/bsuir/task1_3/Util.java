package by.bsuir.task1_3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Util {

    private static BigInteger Id = BigInteger.ZERO;

    public static Abiturient[] getAbiturients(Scanner scanner) {
        int num;
        System.out.print("Enter n : ");
        num = scanner.nextInt();
        scanner.nextLine();
        Abiturient abiturients[] = new Abiturient[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter Last Name : ");
            String lastName = scanner.nextLine();
            System.out.print("Enter Name : ");
            String firstName = scanner.nextLine();
            System.out.print("Enter Patronymic : ");
            String patronymic = scanner.nextLine();
            System.out.print("Enter Address : ");
            String address = scanner.nextLine();
            System.out.print("Enter Phone Number : ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Enter Number Of Marks : ");
            long numMarks = scanner.nextLong();
            List<Integer> marks = new ArrayList<>();
            for (int j = 0; j < numMarks; j++) {
                System.out.print("Enter mark : ");
                int mark = scanner.nextInt();
                marks.add(mark);
            }
            scanner.nextLine();
            abiturients[i] = new Abiturient(getNextId(), lastName, firstName, patronymic, address, phoneNumber, marks);
        }
        return abiturients;
    }

    public static Abiturient[] filterByBadMarks(Abiturient[] abiturients) {
        return Arrays.stream(abiturients).filter((p) -> p.getMarks().stream().anyMatch((b) -> b < 4)).toArray(Abiturient[]::new);
    }

    public static Abiturient[] filterByAVG(Abiturient[] abiturients, double avg) {
        return Arrays.stream(abiturients).filter((p) -> p.getMarks().stream().reduce(0, Integer::sum).doubleValue() / p.getMarks().size() > avg).toArray(Abiturient[]::new);
    }

    public static Abiturient[] sortByAvgDESC(Abiturient[] abiturients) {
        return Arrays.stream(abiturients).sorted(new Comparator<Abiturient>() {
            @Override
            public int compare(Abiturient o1, Abiturient o2) {
                return Double.compare(o2.getMarks().stream().reduce(0, Integer::sum).doubleValue() / o2.getMarks().size(), o1.getMarks().stream().reduce(0, Integer::sum).doubleValue() / o1.getMarks().size());
            }
        }).toArray(Abiturient[]::new);
    }

    public static BigInteger getNextId() {
        Id = Id.add(BigInteger.ONE);
        return Id;
    }

}
