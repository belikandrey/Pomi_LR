package by.bsuir.task1_2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient[] patients = Util.getPatients(scanner);
        System.out.print("Enter Diagnosis : ");
        String diagnosis = scanner.nextLine();
        System.out.println("Patients with diagnosis "+diagnosis+" : ");
        Arrays.stream(Util.filterByDiagnosis(patients, diagnosis)).forEach(System.out::println);

        System.out.print("Enter from(Incl) : ");
        int from = scanner.nextInt();
        System.out.print("Enter To(Excl) : ");
        int to = scanner.nextInt();
        System.out.println("Patients with num medical card from "+from+", to "+to+" :");
        Arrays.stream(Util.filterByNumMedCardRange(patients, from, to)).forEach(System.out::println);
        scanner.close();
    }
}
