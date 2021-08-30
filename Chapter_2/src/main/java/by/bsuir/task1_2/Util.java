package by.bsuir.task1_2;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Util {

    private static BigInteger Id = BigInteger.ZERO;

    public static Patient[] getPatients(Scanner scanner) {
        int num;
        System.out.print("Enter n : ");
        num = scanner.nextInt();
        scanner.nextLine();
        Patient patients[] = new Patient[num];
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
            System.out.print("Enter Number Medical Card : ");
            long numberMedicalCard = scanner.nextLong();
            scanner.nextLine();
            System.out.print("Enter Diagnosis : ");
            String diagnosis = scanner.nextLine();
            System.out.println();
            patients[i] = new Patient(getNextId(), lastName, firstName, patronymic, address, phoneNumber, numberMedicalCard, diagnosis);
        }
        return patients;
    }

    public static Patient[] filterByDiagnosis(Patient[] patients, String diagnosis) {
        return Arrays.stream(patients).filter((p) -> p.getDiagnosis().equalsIgnoreCase(diagnosis)).toArray(Patient[]::new);
    }

    public static Patient[] filterByNumMedCardRange(Patient[] patients, int fromIncl, int toExcl){
        return Arrays.stream(patients).filter((p)->p.getNumberMedicalCard()>=fromIncl && p.getNumberMedicalCard()<toExcl).toArray(Patient[]::new);
    }

    public static BigInteger getNextId() {
        Id = Id.add(BigInteger.ONE);
        return Id;
    }

}
