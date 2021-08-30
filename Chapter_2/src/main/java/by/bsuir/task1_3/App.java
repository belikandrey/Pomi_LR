package by.bsuir.task1_3;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Abiturient[] abiturients = Util.getAbiturients(scanner);
        System.out.println("Abiturients with bad marks : ");
        Arrays.stream(Util.filterByBadMarks(abiturients)).forEach(System.out::println);

        System.out.print("Enter AVG : ");
        double avg = scanner.nextDouble();
        System.out.println("Abiturients with avg huge than " + avg);
        Arrays.stream(Util.filterByAVG(abiturients, avg)).forEach(System.out::println);

        System.out.print("Enter N : ");
        int n = scanner.nextInt();
        Abiturient[] abiturientsSorted = Util.sortByAvgDESC(abiturients);
        System.out.println("Abiturients with hugest avg :");
        for (int i = 0; i < n; i++) {
            System.out.println(abiturientsSorted[i]);
        }
        int ind = n;
        System.out.println("Abiturients with halt-avg :");
        while (ind < abiturientsSorted.length && Double.compare(abiturientsSorted[ind].getMarks().stream().reduce(0, Integer::sum).doubleValue() / abiturientsSorted[ind].getMarks().size(), abiturientsSorted[n - 1].getMarks().stream().reduce(0, Integer::sum).doubleValue() / abiturientsSorted[n - 1].getMarks().size()) == 0) {
            System.out.println(abiturientsSorted[ind]);
            ind++;
        }

        scanner.close();
    }
}
