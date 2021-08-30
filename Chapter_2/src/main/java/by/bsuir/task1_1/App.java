package by.bsuir.task1_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = Util.getStudents(scanner);
        System.out.print("Enter Faculty : ");
        String faculty = scanner.nextLine();
        System.out.println("Students By Your Query : ");
        Arrays.stream(Util.filterByFaculty(students, faculty)).forEach(System.out::println);

        Set<Util.Thread> threads = Util.getAllThreads(students);

        System.out.println();
        for(Util.Thread thread : threads){
            System.out.println("Faculty : "+thread.getFaculty()+", course : "+thread.getCourse());
            Arrays.stream(Util.filterByThread(students, thread)).forEach(System.out::println);
        }

        System.out.println();
        System.out.println("Enter year : ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Students With Year Of Birth After "+year);
        Arrays.stream(Util.filterByYearBirthAfter(students, year)).forEach(System.out::println);

        System.out.println();
        System.out.println("Enter group : ");
        String group = scanner.nextLine();
        System.out.println("Students related to group "+group);
        Arrays.stream(Util.filterByGroup(students, group)).forEach(System.out::println);

        scanner.close();
    }
}
