package by.bsuir.task1_1;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Util {

    private static BigInteger Id = BigInteger.ZERO;

    public static Student [] getStudents(Scanner scanner){
        int num;
        System.out.print("Enter n : ");
        num = scanner.nextInt();
        scanner.nextLine();
        Student students [] = new Student[num];
        for(int i = 0; i < num; i++){
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
            System.out.print("Enter Faculty : ");
            String faculty = scanner.nextLine();
            System.out.print("Enter Course : ");
            int course = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Group : ");
            String group = scanner.nextLine();
            System.out.print("Enter Day of Birth : ");
            int dayBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Month(1 - 12) : ");
            int monthBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Year : ");
            int year = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            students[i] = new Student(getNextId(), lastName, firstName, patronymic, address, phoneNumber, faculty, course, group, dayBirth, monthBirth, year);
        }
        return students;
    }

    static class Thread{
        private String faculty;
        private int course;

        public Thread(String faculty, int course) {
            this.faculty = faculty;
            this.course = course;
        }

        public String getFaculty() {
            return faculty;
        }

        public int getCourse() {
            return course;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Thread thread = (Thread) o;
            return course == thread.course && Objects.equals(faculty, thread.faculty);
        }

        @Override
        public int hashCode() {
            return Objects.hash(faculty, course);
        }
    }

    public static Student [] filterByThread(Student [] students, Thread thread){
        return Arrays.stream(students).filter((p)->p.getFaculty().equals(thread.getFaculty()) && p.getCourse() == thread.getCourse()).toArray(Student[]::new);
    }

    public static Set<Thread> getAllThreads(Student [] students){
        Set<Thread> threadSet = new HashSet<>();
        for(Student student : students){
            threadSet.add(new Thread(student.getFaculty(), student.getCourse()));
        }
        return threadSet;
    }

    public static Student [] filterByFaculty(Student[] students, String faculty){
        return Arrays.stream(students).filter((p)->p.getFaculty().equals(faculty)).toArray(Student[]::new);
    }

    public static Student [] filterByCourse(Student[] students, int course){
        return Arrays.stream(students).filter((p)->p.getCourse() == course).toArray(Student[]::new);
    }

    public static Student [] filterByFacultyCourse(Student[] students, String faculty, int course){
        return Arrays.stream(students).filter((p)->p.getFaculty().equals(faculty) && p.getCourse() == course).toArray(Student[]::new);
    }

    public static Student [] filterByYearBirthAfter(Student[] students, int year){
        return Arrays.stream(students).filter((p)->p.getDateOfBirth().getYear()>year).toArray(Student[]::new);
    }

    public static Student [] filterByGroup(Student[] students, String group){
        return Arrays.stream(students).filter((p)->p.getGroup().equals(group)).toArray(Student[]::new);
    }

    public static BigInteger getNextId(){
        Id = Id.add(BigInteger.ONE);
        return Id;
    }

}
